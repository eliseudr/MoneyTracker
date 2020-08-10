import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * 
 * Classe especifica para o regristro de novo Usuario
 * 
 */

public class Registro extends JFrame implements ActionListener {
	
	JFrame registro = new JFrame();
	
	JLabel email = new JLabel("E-mail: ");
	JTextField emailTexto = new JTextField();

	JLabel usuario = new JLabel("Nome: ");
	JTextField usuarioTexto = new JTextField();

	JLabel senha = new JLabel("Senha: ");
	JTextField senhaTexto = new JTextField();
	
	File file = new File("USERDATA.txt");

	public static void main(String[] args) throws Exception {
		
	File file = new File("USERDATA.txt");
		
			if(file.exists()) {
				file.createNewFile();
			}
	
		//String file = "C:\\Users\\Eliseu\\Desktop";
	}
	
	
	void janelaRegistro() {
		
		String filepath = "usuarios.txt";
		
		//Inserção do email
		email.setBounds(20, 40, 60, 30);
		emailTexto.setBounds(70, 40, 190, 30);
		
		//Inserção do usuario
		usuario.setBounds(20, 80, 60, 30);
		usuarioTexto.setBounds(70, 80, 190, 30);
		
		
		//Inserçao da senha
		senha.setBounds(20, 120, 60, 30);
		senhaTexto.setBounds(70, 120, 190, 30);
		
		//Confirmar senha
		//JLabel senhaConfirmacao = new JLabel("Senha: ");
		//senha.setBounds(20, 120, 60, 30);
		//JTextField senhaTexto = new JTextField();
		//senhaTexto.setBounds(70, 120, 190, 30);
		
		JButton voltar = new JButton("Voltar");
		voltar.setBounds(10, 10, 70, 20);
		//Capturando o evento do botao
		voltar.addActionListener(this);
		
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(50, 260, 180, 40);
		cadastrar.addActionListener(this);
		
		registro.setSize(300, 400); 
		registro.setVisible(true);
		registro.setLocationRelativeTo(null);
		registro.setLayout(null);
		registro.add(cadastrar);
		registro.add(emailTexto);
		registro.add(email);
		registro.add(usuario);
		registro.add(usuarioTexto);
		registro.add(senha);
		registro.add(senhaTexto);
		registro.add(voltar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Botao cadastrar
		if(e.getActionCommand().equals("Cadastrar")) {
			
			// Escrevendo no arquivo
			try {
				FileWriter fw = new FileWriter(file);
				emailTexto.write(fw);
				usuarioTexto.write(fw);
				senhaTexto.write(fw);
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
				System.out.println("ERROR !!!");
			}
			
			
			/********************************/
			//Fechar e abrir nova janela de logIn
			registro.setVisible(false);
			
			Entrada entrada = new Entrada();
			entrada.abrirJanela();
			/********************************/
		}
		//Botao voltar
		if(e.getActionCommand().equals("Voltar")) {
			registro.setVisible(false);
			
			Entrada entrada = new Entrada();
			entrada.abrirJanela();
		}	
	}
}
