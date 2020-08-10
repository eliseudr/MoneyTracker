import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import sun.java2d.loops.DrawRect;

/*
 * 
 * Classe especifica para a tela pos LogIn.
 * 
*/
public class Home extends JFrame implements ActionListener {
	//Declarando nova janela
	
	JFrame home = new JFrame();
	
	//Adicionando Layout
	void HomeDesing() {
		
		JPanel visaoGeral = new JPanel();
		JPanel transferencias = new JPanel();
		JPanel historico = new JPanel();
		JPanel fundo = new JPanel();
		
		visaoGeral.setBackground(Color.darkGray);
		transferencias.setBackground(Color.darkGray);
		historico.setBackground(Color.darkGray);
		//Ultimo panel cobre o fundo todo
		fundo.setBackground(Color.lightGray);
		
		//setSize controla a largura e altura do painel
		visaoGeral.setBounds(20, 50, 0, 0);;
		visaoGeral.setSize(new Dimension(970, 400));
		
		transferencias.setBounds(20, 470, 0, 0);
		transferencias.setSize(new Dimension(475, 240));
		
		historico.setBounds(515, 470, 0, 0);
		historico.setSize(new Dimension(475, 240));
		
		home.add(visaoGeral);
		home.add(transferencias);
		home.add(historico);
		home.add(fundo);
		
	}
	
	void janelaHome() {
		
		home.setTitle("Money Tracker ");
		
		//Botao para deslogar
		JButton sair = new JButton("Sair");
		sair.setBounds(934, 20, 60, 20);
		//Capturando o evento do botao
		sair.addActionListener(this);
		
		HomeDesing();
		
		//Definicios da janela HOME
		home.setSize(1024, 768);
		home.setVisible(true);
		home.getContentPane().setLayout(null);
		home.setLocationRelativeTo(null); 
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Funcionalidades abaixo
		home.add(sair);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Action voltar para tela de LOG IN
		if(e.getActionCommand().equals("Sair")) {
			home.setVisible(false);
			
			Entrada entrada = new Entrada();
			entrada.abrirJanela();
			
		}
		
	}
	
}
