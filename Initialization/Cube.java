package Initialization;
import java.util.HashSet;

public class Cube {
	private double SideLength;
	private double CellLength;
	public HashSet<Point> set= new HashSet<Point>();
	
	public double getSideLength() {
		return SideLength;
	}
	
	public void setSideLength(double sideLength) {
		SideLength = sideLength;
	}
	
	public Cube(double sideLength, double cellLength) {
		super();
		SideLength = sideLength;
		CellLength = cellLength;
		
		int n=(int) Math.ceil(sideLength/cellLength);
		// front
		Side front= new Side();
		HashSet<Point> set1 = new HashSet<Point>();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				Point p = new Point(-sideLength/2+j*cellLength,-sideLength/2,sideLength/2-i*cellLength);
				set.add(p);
				set1.add(p);
			}
		}
		front.setPoints(set1);
		this.setFront(front);
		
		// back
				Side back= new Side();
				HashSet<Point> set2 = new HashSet<Point>();
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						Point p = new Point(-sideLength/2+j*cellLength,sideLength/2,sideLength/2-i*cellLength);
						set.add(p);
						set2.add(p);
					}
				}
				back.setPoints(set2);
				this.setBack(back);

		// left
		Side left= new Side();
		HashSet<Point> set3 = new HashSet<Point>();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				Point p = new Point(-sideLength/2,-sideLength/2+j*cellLength,-sideLength/2+i*cellLength);
				set.add(p);
				set3.add(p);
			}
		}
		left.setPoints(set3);
		this.setLeft(left);

		// right
				Side right= new Side();
				HashSet<Point> set4 = new HashSet<Point>();
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						Point p = new Point(sideLength/2,-sideLength/2+j*cellLength,-sideLength/2+i*cellLength);
						set.add(p);
						set4.add(p);
					}
				}
				right.setPoints(set4);
				this.setRight(right);
				
		// top
		Side top= new Side();
		HashSet<Point> set5 = new HashSet<Point>();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				Point p = new Point(-sideLength/2+j*cellLength,-sideLength/2+i*cellLength,sideLength/2);
				set.add(p);
				set5.add(p);
			}
		}
		top.setPoints(set5);
		this.setTop(top);		
	
		// bottom
				Side bottom= new Side();
				HashSet<Point> set6 = new HashSet<Point>();
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						Point p = new Point(-sideLength/2+j*cellLength,-sideLength/2+i*cellLength,-sideLength/2);
						set.add(p);
						set6.add(p);
					}
				}
				bottom.setPoints(set6);
				this.setBottom(bottom);
	}

	public double getCellLength() {
		return CellLength;
	}

	public void setCellLength(int cellLength) {
		CellLength = cellLength;
	}

	private Side Top;
	private Side Bottom;
	private Side Left;
	private Side Right;
	private Side Front;
	private Side Back;

	public Side getTop() {
		return Top;
	}

	public void setTop(Side top) {
		Top = top;
	}

	public Side getBottom() {
		return Bottom;
	}

	public void setBottom(Side bottom) {
		Bottom = bottom;
	}

	public Side getLeft() {
		return Left;
	}

	public void setLeft(Side left) {
		Left = left;
	}

	public Side getRight() {
		return Right;
	}

	public void setRight(Side right) {
		Right = right;
	}

	public Side getFront() {
		return Front;
	}

	public void setFront(Side front) {
		Front = front;
	}

	public Side getBack() {
		return Back;
	}

	public void setBack(Side back) {
		Back = back;
	}
}