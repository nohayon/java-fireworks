package ohayon.mco152.physics;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;


public class ProjectileComponent extends JComponent {

	private static final long serialVersionUID = 3261109518175746417L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.translate(0, this.getHeight());
		Projectile p = new Projectile(0, 0, 43, 45);
		for (int t = 0; t <=10; t++){
			Point point = p.getPositionAtTime(t);
			g.drawOval(point.x, -(point.y), 10, 10);
		}
	}

	
}
