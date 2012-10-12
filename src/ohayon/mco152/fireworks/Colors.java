package ohayon.mco152.fireworks;

import java.awt.Color;
import java.util.Random;

public class Colors {
	
	public static Color getColor() {
		Random generator = new Random();
		return new Color(generator.nextInt(256), generator.nextInt(256),
				generator.nextInt(256));
	}

}
