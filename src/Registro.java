import java.awt.event.ActionListener;

import javax.swing.JFrame;

/*
 * 
 * Classe especifica para o regristro de novo Usuario
 * 
 */

public class Registro extends JFrame implements ActionListener {

	void janelaRegistro() {
		
		JFrame registro = new JFrame();
		
		registro.setSize(300, 400); 
		registro.setVisible(true);
		registro.setLocationRelativeTo(null);
	}
	
}
