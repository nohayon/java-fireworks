package ohayon.mco152.fireworks.explosions;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import ohayon.mco152.fireworks.Colors;
import ohayon.mco152.fireworks.Firework;

public class ThreeCircleExplosion implements Explosion {

	private Random generator = new Random();

	@Override
	public ArrayList<Firework> explode(Firework f) {
		ArrayList<Firework> list = new ArrayList<Firework>();
		Point p = f.getPosition();
		double v = f.getV();

		Color randomColor1 = Colors.getColor();
		Color randomColor2 = Colors.getColor();
		Color randomColor3 = Colors.getColor();

		for (int i = 0; i < 65; i++) {
			list.add(new Firework(p.x, p.y, v - 40, (double) generator
					.nextInt(360), randomColor1, f.getTtl() + 2, null, null));
		}
		for (int i = 0; i < 65; i++) {
			list.add(new Firework(p.x, p.y, v - 20, (double) generator
					.nextInt(360), randomColor2, f.getTtl() + 2, null, null));
		}
		for (int i = 0; i < 65; i++) {
			list.add(new Firework(p.x, p.y, v, (double) generator.nextInt(360),
					randomColor3, f.getTtl() + 2, null, null));
		}
		return list;
	}

}
