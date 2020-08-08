import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
 * 
 * Classe especifica para a tela pos LogIn.
 * 
*/
public class Home extends JFrame implements ActionListener {

	void janelaHome() {
		JFrame home = new JFrame();
		
		home.setSize(1024, 768);
		home.setVisible(true);
		home.setLocationRelativeTo(null);
	}
	
}
