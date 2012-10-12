package ohayon.mco152.physics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ProjectileFrame extends JFrame {

	private static final long serialVersionUID = 3059656093448425510L;

	public ProjectileFrame() {
		setTitle("Projectile Viewer");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new ProjectileComponent());
	}

	public static void main(String[] args) {
		new ProjectileFrame().setVisible(true);

	}

}
