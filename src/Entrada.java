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
	
	JFrame janela = new JFrame();
	
	void abrirJanela() {
		
		
		janela.setTitle("Money Tracker ");
		
		//Botao "Entrar"
		JButton entrar = new JButton("Entrar");
		entrar.setBounds(50, 200, 180, 40);
		entrar.addActionListener(this);
		
		//Botao "Cadastrar"
		JButton cadastrar = new JButton("Registre-se");
		cadastrar.setBounds(50, 260, 180, 40);
		cadastrar.addActionListener(this);
		
		//Botao "Nome:"
		JLabel label1 = new JLabel();
		label1.setText("Nome:");
		label1.setBounds(20, 65, 200, 100);
		//label1.setBounds(x, y, width, height);
		// ************* POSIÇAO NO `CANVAS` **************
	
		//Campo para digitar nome
		JTextField texto = new JTextField();
		texto.setBounds(65, 100, 190, 30);
		
		//Adicionando na janela
		janela.add(texto);
		janela.add(label1);
		janela.add(entrar);
		janela.add(cadastrar);
		janela.setSize(300, 400);    
		janela.setLayout(null);    
		janela.setVisible(true);    
		janela.setLocationRelativeTo(null); //Abrir janela no meio da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Checando se o botao foi clicado
		if( e.getActionCommand().equals("Entrar")) {
			//Abrir App
			//Fechando janela anterior
			janela.setVisible(false);
			
			//Instanciando metodo HOME
			Home home = new Home();
			home.janelaHome();
			
		}else if( e.getActionCommand().equals("Registre-se")){
			//Fechando janela anterior
			janela.setVisible(false);
			
			//Instanciando Registro
			Registro registro = new Registro();
			registro.janelaRegistro();
			
			//Abrir janela de cadastro novo usario
			System.out.println("Cadastro selecionado");
		}
		
	}
	
}


