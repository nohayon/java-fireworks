package ohayon.mco152.fireworks;

import javax.swing.JFrame;

public class FireworkFrame extends JFrame {

	private static final long serialVersionUID = 3557644674244370222L;

	public FireworkFrame() {
		setTitle("Fireworks");
		setSize(900, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		add(new FireworkComponent());
	}
	
	public static void main(String[] args) {
		new FireworkFrame().setVisible(true);
	}
	
	

}
