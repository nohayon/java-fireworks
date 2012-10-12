package ohayon.mco152.fireworks;

import java.awt.Point;

public class PointAndTime {
	
	private Point point;
	private double time;
	
	public PointAndTime(Point p, double t) {
		this.point = p;
		this.time = t;
	}

	public Point getPoint() {
		return point;
	}

	public double getTime() {
		return time;
	}

}
