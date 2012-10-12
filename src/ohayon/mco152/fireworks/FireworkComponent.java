package ohayon.mco152.fireworks;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class FireworkComponent extends JComponent {
	private static final long serialVersionUID = -2376376082098244901L;

	private static final Logger logger = Logger
			.getLogger(FireworkComponent.class.getName());

	private World world;
	private BufferedImage foregroundImg;
	private BufferedImage backgroundImg;

	public FireworkComponent() {
		world = new World();

		try {
			backgroundImg = ImageIO
					.read(ClassLoader.class
							.getResourceAsStream("/ohayon/mco152/fireworks/background.png"));

			foregroundImg = ImageIO
					.read(ClassLoader.class
							.getResourceAsStream("/ohayon/mco152/fireworks/foreground.png"));

		} catch (IOException e) {
			logger.log(Level.INFO, e.getMessage());
		}
	}

	public void paintBackground(Graphics g) {
		g.drawImage(backgroundImg, 0, 0, this.getWidth(), this.getHeight(),
				null);
	}

	public void paintForeground(Graphics g) {
		g.drawImage(foregroundImg, 0, 0, this.getWidth(), this.getHeight(),
				null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintBackground(g);
		g.translate(0, this.getHeight());

		world.tick();
		drawFireworks(g);

		g.translate(0, -this.getHeight());
		paintForeground(g);

		this.repaint();
	}

	private void drawFireworks(Graphics g) {
		for (int i = 0; i < world.getFireworks().size(); i++) {
			drawFirework(world.getFireworks().get(i), g);
		}
	}

	public void drawFirework(Firework f, Graphics g) {
		f.drawFirework(g);
		if (f.getTrail() != null) {
			f.drawTrail(g);
		}
	}

}