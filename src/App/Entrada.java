package App;
import java.awt.event.*;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
Classe responsavel pela tela de login e cadastro
*/

public class Entrada extends JFrame implements ActionListener {
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null; 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame janela = new JFrame();
	
	JButton entrar = new JButton("Entrar");
	JButton cadastrar = new JButton("Registre-se");
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JTextField nomeUsuario = new JTextField();
	JPasswordField senhaUsuario = new JPasswordField(20);
	
	void abrirJanela() {
		
		janela.setTitle("Money Tracker ");
		
		//Botao "Entrar"
		entrar.setBounds(50, 200, 180, 40);
		entrar.addActionListener(this);
		
		//Botao "Cadastrar"
		cadastrar.setBounds(50, 260, 180, 40);
		cadastrar.addActionListener(this);
		
		//Botao "Nome:"
		label1.setText("Nome:");
		label1.setBounds(20, 35, 200, 100);
		//label1.setBounds(x, y, width, height);
		// ************* POSIÇAO NO `CANVAS` **************
		
		label2.setText("Senha:");
		label2.setBounds(20, 75, 200, 100);
	
		//Campo para digitar nome
		nomeUsuario.setBounds(65, 70, 190, 30);
		
		//Campo para digitar senha
		senhaUsuario.setBounds(65, 110, 190, 30);
		
		//Adicionando na janela
		janela.add(nomeUsuario);
		janela.add(senhaUsuario);
		janela.add(label1);
		janela.add(label2);
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
			
			//Autenticando no SQLITE
			/*********************************/
					
				try { 
					
					Conexao connect = new Conexao();
					conn = connect.getConexao();
					
					String sql = "select * from usuarios where nome='" + nomeUsuario.getText() + "' and senha='" + senhaUsuario.getText() + "'";	
					PreparedStatement pst = conn.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					
					int count =0;
					
					
					while( rs.next() ) {
						count = count+1;
					}
					
					if(count == 1) {
						JOptionPane.showMessageDialog(null, "Usuario e senha estão corretos!");
						janela.setVisible(false);
						
						Home home = new Home();
						home.janelaHome();
						
					}
					else if(count > 1) {
						JOptionPane.showMessageDialog(null, "Usuario e senha duplicados");
					}
					else {
						JOptionPane.showMessageDialog(null, "Usuario/Senha incorreto!");
					}
					
					rs.close();
					pst.close();
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "pica");
				}
			
		}else if( e.getActionCommand().equals("Registre-se")){
			
			//Fechando janela anterior
			janela.setVisible(false);
			
			//Abrir janela de registro
			Registro registro = new Registro();
			registro.janelaRegistro();
		}
		
	}
	
}


