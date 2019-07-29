package SetCover;
import java.util.HashSet;
import java.util.PriorityQueue;

import Helper.Helper;
import Initialization.Box;
import Initialization.Cube;
import Initialization.Point;

public class CoverSet {
	public PriorityQueue<CoverPoint>  priorityQueue= new PriorityQueue<CoverPoint>();
	
	public CoverSet() {
		super();
	}

	public CoverSet(Cube cube, Box box, double r) {
		HashSet<Point> top=box.getTop();
		HashSet<Point> bottom=box.getBottom();
		HashSet<Point> front=box.getFront();
		HashSet<Point> back=box.getBack();
		HashSet<Point> left=box.getLeft();
		HashSet<Point> right=box.getRight();
		for(Point i : top) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : bottom) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : front) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : back) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : left) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : right) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		HashSet<Point> topFront=box.getTopFront();
		HashSet<Point> topLeft=box.getTopLeft();
		HashSet<Point> topBack=box.getTopBack();
		HashSet<Point> topRight=box.getTopRight();
		for(Point i : topFront) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : topLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : topBack) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : topRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		HashSet<Point> bottomFront=box.getBottomFront();
		HashSet<Point> bottomLeft=box.getBottomLeft();
		HashSet<Point> bottomBack=box.getBottomBack();
		HashSet<Point> bottomRight=box.getBottomRight();
		for(Point i : bottomFront) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : bottomLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : bottomBack) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : bottomRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		
		HashSet<Point> frontLeft=box.getFrontLeft();
		HashSet<Point> frontRight=box.getFrontRight();
		HashSet<Point> backLeft=box.getBackLeft();
		HashSet<Point> backRight=box.getBackRight();
		for(Point i : frontLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : frontRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : backLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : backRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		HashSet<Point> topFrontLeft=box.getTopFrontLeft();
		HashSet<Point> topFrontRight=box.getTopFrontRight();
		HashSet<Point> topBackLeft=box.getTopBackLeft();
		HashSet<Point> topBackRight=box.getTopBackRight();
		for(Point i : topFrontLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : topFrontRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : topBackLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : topBackRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getTop().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		HashSet<Point> bottomFrontLeft=box.getBottomFrontLeft();
		HashSet<Point> bottomFrontRight=box.getBottomFrontRight();
		HashSet<Point> bottomBackLeft=box.getBottomBackLeft();
		HashSet<Point> bottomBackRight=box.getBottomBackRight();
		for(Point i : bottomFrontLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : bottomFrontRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getFront().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : bottomBackLeft) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getLeft().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		for(Point i : bottomBackRight) {
			CoverPoint cp=new CoverPoint();
			cp.setPoint(i);
			for(Point j: cube.getBottom().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getBack().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			for(Point j: cube.getRight().getPoints()) {
				if(Helper.dist(i,j)<r)
					cp.getSet().add(j);
			}
			priorityQueue.add(cp);
		}
		
	}

}
