import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 
 * Classe especifica para a tela pos LogIn.
 * 
*/
public class Home extends JFrame implements ActionListener {
	//Declarando nova janela
	
	JFrame home = new JFrame();
	
	
	void janelaHome() {
		
		home.setTitle("Money Tracker ");
		
		//Botao para deslogar
		JButton sair = new JButton("Sair");
		sair.setBounds(934, 20, 60, 20);
		//Capturando o evento do botao
		sair.addActionListener(this);
		
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
