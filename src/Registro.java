import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * 
 * Classe especifica para o regristro de novo Usuario
 * 
 */

public class Registro extends JFrame implements ActionListener {

	JFrame registro = new JFrame();
	
	void janelaRegistro() {
		
		
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(50, 260, 180, 40);
		cadastrar.addActionListener(this);
		
		//Inserção do email
		JLabel email = new JLabel("E-mail: ");
		email.setBounds(20, 40, 60, 30);
		JTextField emailTexto = new JTextField();
		emailTexto.setBounds(70, 40, 190, 30);
		
		//Inserção do usuario
		JLabel usuario = new JLabel("Nome: ");
		usuario.setBounds(20, 80, 60, 30);
		JTextField usuarioTexto = new JTextField();
		usuarioTexto.setBounds(70, 80, 190, 30);
		
		//Inserçao da senha
		JLabel senha = new JLabel("Senha: ");
		senha.setBounds(20, 120, 60, 30);
		JTextField senhaTexto = new JTextField();
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
			registro.setVisible(false);
			
			Entrada entrada = new Entrada();
			entrada.abrirJanela();
		}
		//Botao voltar
		if(e.getActionCommand().equals("Voltar")) {
			registro.setVisible(false);
			
			Entrada entrada = new Entrada();
			entrada.abrirJanela();
		}
		
	}
	
}
