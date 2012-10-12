package ohayon.mco152.fireworks;

import java.awt.Color;

import ohayon.mco152.fireworks.explosions.MultipleExplosion;
import ohayon.mco152.fireworks.explosions.RandomExplosion;
import ohayon.mco152.fireworks.explosions.SmileyFaceExplosion;
import ohayon.mco152.fireworks.explosions.SpiderExplosion;
import ohayon.mco152.fireworks.explosions.ThreeCircleExplosion;

public class PerformanceCannon extends Cannon {
	
	public PerformanceCannon(){
		addFAT(new FireworkAndTime(new Firework(100, 300, 73, 90, Color.RED, 3,
				new RandomExplosion(), null), .2));
		addFAT(new FireworkAndTime(new Firework(700, 300, 73, 90, Color.RED, 3,
				new RandomExplosion(), null), .2));
		addFAT(new FireworkAndTime(new Firework(450, 300, 73, 90, Color.BLUE, 3,
				new SpiderExplosion(), new Trail(3.0)), .2));
		
		addFAT(new FireworkAndTime(new Firework(250, 300, 90, 85, Color.YELLOW, 3,
				new SmileyFaceExplosion(), null), 6.5));
		addFAT(new FireworkAndTime(new Firework(550, 300, 90, 95, Color.YELLOW, 3,
				new SmileyFaceExplosion(), null), 6.5));
		
		addFAT(new FireworkAndTime(new Firework(250, 300, 73, 105, Color.RED, 4,
				new RandomExplosion(), new Trail(2.5)), 11));
		addFAT(new FireworkAndTime(new Firework(550, 300, 73, 75, Color.RED, 4,
				new RandomExplosion(), new Trail(2.5)), 11));
		
		addFAT(new FireworkAndTime(new Firework(250, 300, 94, 90, Color.GREEN, 3,
				new ThreeCircleExplosion(), null), 16));
		addFAT(new FireworkAndTime(new Firework(550, 300, 94, 90, Color.GREEN, 3,
				new ThreeCircleExplosion(), null), 16));

		addFAT(new FireworkAndTime(new Firework(450, 300, 73, 90, Color.YELLOW, 3,
				new SmileyFaceExplosion(), null), 20));
		addFAT(new FireworkAndTime(new Firework(700, 300, 73, 90, Color.GREEN, 3,
				new MultipleExplosion(), null), 20));
		addFAT(new FireworkAndTime(new Firework(100, 300, 73, 90, Color.GREEN, 3,
				new MultipleExplosion(), null), 20));
	}

}
