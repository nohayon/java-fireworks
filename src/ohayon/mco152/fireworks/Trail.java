package ohayon.mco152.fireworks;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class Trail {

	private static final Logger logger = Logger
			.getLogger(World.class.getName());

	private double duration;
	private ArrayList<PointAndTime> points;

	public Trail(Double duration) {
		this.duration = duration;
		points = new ArrayList<PointAndTime>();
	}

	public ArrayList<PointAndTime> getPath() {
		return points;
	}

	public void addPoint(Point p, double time) {
		points.add(new PointAndTime(p, time));

		Iterator<PointAndTime> iter = points.iterator();
		while (iter.hasNext()) {
			PointAndTime pt = iter.next();
			if (pt.getTime() < (time - duration)) {
				iter.remove();
			}
		}
	}

	public void drawTrail(Graphics g) {
		for (int i = 1; i < points.size(); i++) {
			Point p = points.get(i - 1).getPoint();
			Point q = points.get(i).getPoint();
			g.drawLine(p.x, -(p.y), q.x, -(q.y));
		}
	}

}
