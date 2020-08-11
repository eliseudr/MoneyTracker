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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.*;
import java.io.*;

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

	JLabel senhaLabel = new JLabel("Senha: ");
	JPasswordField senhaTexto = new JPasswordField(20);
	
	JLabel senhaConfirmacao = new JLabel("Senha*: ");
	JPasswordField senhaConfirmacaoTexto = new JPasswordField(20);
	
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
		
		//Inserção do usuario
		usuario.setBounds(20, 80, 60, 30);
		usuarioTexto.setBounds(70, 80, 190, 30);
		
		
		//Inserçao da senha
		senhaLabel.setBounds(20, 120, 60, 30);
		senhaTexto.setBounds(70, 120, 190, 30);
		
		//Confirmar senha
		senhaConfirmacao.setBounds(20, 160, 60, 30);
		senhaConfirmacaoTexto.setBounds(70, 160, 190, 30);
		
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
		registro.add(usuario);
		registro.add(usuarioTexto);
		registro.add(senhaLabel);
		registro.add(senhaTexto);
		registro.add(senhaConfirmacao);
		registro.add(senhaConfirmacaoTexto);
		registro.add(voltar);
		
		//Salvando senha(HIDDEN)
		char[] senha = senhaTexto.getPassword();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Botao cadastrar
		if(e.getActionCommand().equals("Cadastrar")) {
			
			if(Arrays.equals(senhaTexto.getPassword(), senhaConfirmacaoTexto.getPassword())) {
				System.out.println("confirmaçao efetuada");
			
				// Escrevendo no arquivo
				try {
					FileWriter fw = new FileWriter(file);
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
		}else {
			System.out.println("Senha incorreta");
			}
		}
		
		//Botao voltar
		if(e.getActionCommand().equals("Voltar")) {
			registro.setVisible(false);
			
			Entrada entrada = new Entrada();
			entrada.abrirJanela();
		}	
	}
}
