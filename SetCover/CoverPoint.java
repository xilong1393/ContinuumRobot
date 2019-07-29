package SetCover;

import java.util.HashSet;

import Initialization.Point;

public class CoverPoint implements Comparable<CoverPoint> {
	private Point point;
	private HashSet<Point> set =new HashSet<Point>();
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public HashSet<Point> getSet() {
		return set;
	}
	public void setSet(HashSet<Point> set) {
		this.set = set;
	}
	@Override
	public int compareTo(CoverPoint o) {
		return -this.getSet().size()+o.getSet().size();
	}
}