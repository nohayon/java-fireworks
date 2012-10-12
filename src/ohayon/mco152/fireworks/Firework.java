package ohayon.mco152.fireworks;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import ohayon.mco152.fireworks.explosions.Explosion;
import ohayon.mco152.physics.Projectile;

public class Firework extends Projectile {

	private Color color;
	private double ttl;
	private Explosion explosion;
	private Trail trail;

	public Firework(double xi, double yi, double v, double theta, Color color,
			double ttl, Explosion explosion, Trail trail) {
		super(xi, yi, v, theta);
		this.color = color;
		this.ttl = ttl;
		this.explosion = explosion;
		this.trail = trail;
	}

	public double getTtl() {
		return this.ttl;
	}

	public Color getColor() {
		return color;
	}

	public Point getPosition() {
		return getPositionAtTime(getTime());
	}

	public void drawFirework(Graphics g) {
		Point p = getPosition();
		g.setColor(getColor());
		g.fillOval(p.x-4, -(p.y)-4, 8, 8);
	}

	public boolean isPastTimeToLive() {
		return getTime() >= ttl;
	}

	public ArrayList<PointAndTime> getPath() {
		return trail.getPath();
	}

	public Trail getTrail() {
		return trail;
	}

	public boolean hasExplosion() {
		return explosion != null;
	}

	public boolean hasTrail() {
		return trail != null;
	}

	public ArrayList<Firework> getExplosion() {
		return explosion.explode(this);
	}

	public void drawTrail(Graphics g) {
		trail.drawTrail(g);		
	}
}
