import java.awt.TextField;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
Classe responsavel pela tela de login e cadastro
*/

public class Entrada extends JFrame implements ActionListener {

	public static void main(String[] args) {
		
	}
	
	void abrirJanela() {
		JFrame janela = new JFrame();

		janela.setTitle("Money Tracker ");
		
		//Botao "Entrar"
		JButton entrar = new JButton("Entrar");
		entrar.setBounds(35, 200, 100, 40);
		entrar.addActionListener(this);
		
		//Botao "Cadastrar"
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(145, 200, 100, 40);
		cadastrar.addActionListener(this);
		
		//Botao "Nome:"
		JLabel label1 = new JLabel();
		label1.setText("Nome:");
		label1.setBounds(20, 60, 200, 100);
		//label1.setBounds(x, y, width, height);
	
		//Campo para digitar nome
		JTextField texto = new JTextField();
		texto.setBounds(110, 100, 130, 30);
		
		//Adicionando na janela
		janela.add(texto);
		janela.add(label1);
		janela.add(entrar);
		janela.add(cadastrar);
		janela.setSize(300, 400);    
		janela.setLayout(null);    
		janela.setVisible(true);    
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Checando se o botao foi clicado
		if( e.getActionCommand().equals("Entrar")) {
			//Abrir App
			System.out.println("Entrar selecionado");
		}else if( e.getActionCommand().equals("Cadastrar")){
			//Abrir janela de cadastro novo usario
			System.out.println("Cadastro selecionado");
		}
		
	}
	
}


