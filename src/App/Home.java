package App;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * 
 * Classe especifica para a tela pos LogIn.
 * 
*/
public class Home extends JFrame implements ActionListener {
	//Declarando nova janela
	
	//Implementaçao do ID (Nao sei pra quer serve)
	private static final long serialVersionUID = 1L;

	JFrame home = new JFrame();
	
	//Adicionando Layout
	void HomeDesing() {
		
		JPanel visaoGeral = new JPanel();
		JPanel transferencias = new JPanel();
		JPanel historico = new JPanel();
		JPanel fundo = new JPanel();
		
		JLabel labelVisaoGeral = new JLabel("Visao Geral");
		JLabel labelTransferencias = new JLabel("Transferencias");
		JLabel labelHistorico = new JLabel("Historico");
		
		visaoGeral.setBackground(Color.darkGray);
		transferencias.setBackground(Color.darkGray);
		historico.setBackground(Color.darkGray);
		//Ultimo panel cobre o fundo todo
		fundo.setBackground(Color.lightGray);
		
		/**********************************************/
		
		//setSize controla a largura e altura do painel
		visaoGeral.setBounds(20, 50, 0, 0);;
		visaoGeral.setSize(new Dimension(970, 400));
		//Label Visao Geral
		labelVisaoGeral.setBounds(40, 60, 280, 60);
		labelVisaoGeral.setFont(new Font("Calibri", Font.BOLD, 54));
		labelVisaoGeral.setForeground(Color.white);
		labelVisaoGeral.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("1");
				labelVisaoGeral.setForeground(Color.white);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				labelVisaoGeral.setForeground(Color.lightGray);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				labelVisaoGeral.setFont(new Font("Calibri", Font.BOLD, 54));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				labelVisaoGeral.setFont(new Font("Calibri", Font.BOLD, 56));
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				//Click
			}
			
		});
		
		/**********************************************/
		
		transferencias.setBounds(20, 470, 0, 0);
		transferencias.setSize(new Dimension(475, 240));
		labelTransferencias.setBounds(40, 480, 220, 40);
		labelTransferencias.setFont(new Font("Calibri", Font.BOLD, 32));
		labelTransferencias.setForeground(Color.white);
		labelTransferencias.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {
				labelTransferencias.setForeground(Color.lightGray);
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				labelTransferencias.setForeground(Color.white);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				labelTransferencias.setFont(new Font("Calibri", Font.BOLD, 34));
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				labelTransferencias.setFont(new Font("Calibri", Font.BOLD, 32));
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {	
			}			
		});
		
		
		/**********************************************/
		
		historico.setBounds(515, 470, 0, 0);
		historico.setSize(new Dimension(475, 240));
		labelHistorico.setBounds(535, 480, 200, 40);
		labelHistorico.setFont(new Font("Calibri", Font.BOLD, 32));
		labelHistorico.setForeground(Color.white);
		labelHistorico.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {
				labelHistorico.setForeground(Color.lightGray);
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				labelHistorico.setForeground(Color.white);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				labelHistorico.setFont(new Font("Calibri", Font.BOLD, 34));
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				labelHistorico.setFont(new Font("Calibri", Font.BOLD, 32));
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {			
			}
			
		});
		
		/**********************************************/
		
		home.add(labelVisaoGeral);
		home.add(labelTransferencias);
		home.add(labelHistorico);
		
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
