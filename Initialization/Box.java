package Initialization;

import java.util.HashSet;
//outer space place the cube
public class Box {
	private double SideLength;
	private HashSet<Point> Points;
	private double BoxCellLength;
	private HashSet<Point> Top=new HashSet<Point>();
	private HashSet<Point> Bottom=new HashSet<Point>();
	private HashSet<Point> Front=new HashSet<Point>();
	private HashSet<Point> Back=new HashSet<Point>();
	private HashSet<Point> Left=new HashSet<Point>();
	private HashSet<Point> Right=new HashSet<Point>();
	private HashSet<Point> TopLeft=new HashSet<Point>();
	private HashSet<Point> TopRight=new HashSet<Point>();
	private HashSet<Point> TopFront=new HashSet<Point>();
	private HashSet<Point> TopBack=new HashSet<Point>();
	private HashSet<Point> FrontLeft=new HashSet<Point>();
	public HashSet<Point> getFrontLeft() {
		return FrontLeft;
	}

	public void setFrontLeft(HashSet<Point> frontLeft) {
		FrontLeft = frontLeft;
	}

	public HashSet<Point> getBackLeft() {
		return BackLeft;
	}

	public void setBackLeft(HashSet<Point> backLeft) {
		BackLeft = backLeft;
	}

	public HashSet<Point> getBackRight() {
		return BackRight;
	}

	public void setBackRight(HashSet<Point> backRight) {
		BackRight = backRight;
	}

	public HashSet<Point> getFrontRight() {
		return FrontRight;
	}

	public void setFrontRight(HashSet<Point> frontRight) {
		FrontRight = frontRight;
	}

	private HashSet<Point> BackLeft=new HashSet<Point>();
	private HashSet<Point> BackRight=new HashSet<Point>();
	private HashSet<Point> FrontRight=new HashSet<Point>();
	private HashSet<Point> BottomLeft=new HashSet<Point>();
	private HashSet<Point> BottomRight=new HashSet<Point>();
	private HashSet<Point> BottomFront=new HashSet<Point>();
	private HashSet<Point> BottomBack=new HashSet<Point>();
	private HashSet<Point> TopFrontLeft=new HashSet<Point>();
	private HashSet<Point> TopFrontRight=new HashSet<Point>();
	private HashSet<Point> TopBackLeft=new HashSet<Point>();
	private HashSet<Point> TopBackRight=new HashSet<Point>();
	private HashSet<Point> BottomFrontLeft=new HashSet<Point>();
	private HashSet<Point> BottomFrontRight=new HashSet<Point>();
	private HashSet<Point> BottomBackLeft=new HashSet<Point>();
	private HashSet<Point> BottomBackRight=new HashSet<Point>();
	
	public HashSet<Point> getTop() {
		return Top;
	}

	public void setTop(HashSet<Point> top) {
		Top = top;
	}

	public HashSet<Point> getBottom() {
		return Bottom;
	}

	public void setDown(HashSet<Point> bottom) {
		Bottom = bottom;
	}

	public HashSet<Point> getFront() {
		return Front;
	}

	public void setFront(HashSet<Point> front) {
		Front = front;
	}

	public HashSet<Point> getBack() {
		return Back;
	}

	public void setBack(HashSet<Point> back) {
		Back = back;
	}

	public HashSet<Point> getLeft() {
		return Left;
	}

	public void setLeft(HashSet<Point> left) {
		Left = left;
	}

	public HashSet<Point> getRight() {
		return Right;
	}

	public void setRight(HashSet<Point> right) {
		Right = right;
	}

	public HashSet<Point> getTopLeft() {
		return TopLeft;
	}

	public void setTopLeft(HashSet<Point> topLeft) {
		TopLeft = topLeft;
	}

	public HashSet<Point> getTopRight() {
		return TopRight;
	}

	public void setTopRight(HashSet<Point> topRight) {
		TopRight = topRight;
	}

	public HashSet<Point> getTopFront() {
		return TopFront;
	}

	public void setTopFront(HashSet<Point> topFront) {
		TopFront = topFront;
	}

	public HashSet<Point> getTopBack() {
		return TopBack;
	}

	public void setTopBack(HashSet<Point> topBack) {
		TopBack = topBack;
	}

	public HashSet<Point> getBottomLeft() {
		return BottomLeft;
	}

	public void setBottomLeft(HashSet<Point> bottomLeft) {
		BottomLeft = bottomLeft;
	}

	public HashSet<Point> getBottomRight() {
		return BottomRight;
	}

	public void setBottomRight(HashSet<Point> bottomRight) {
		BottomRight = bottomRight;
	}

	public HashSet<Point> getBottomFront() {
		return BottomFront;
	}

	public void setBottomFront(HashSet<Point> bottomFront) {
		BottomFront = bottomFront;
	}

	public HashSet<Point> getBottomBack() {
		return BottomBack;
	}

	public void setBottomBack(HashSet<Point> bottomBack) {
		BottomBack = bottomBack;
	}

	public HashSet<Point> getTopFrontLeft() {
		return TopFrontLeft;
	}

	public void setTopFrontLeft(HashSet<Point> topFrontLeft) {
		TopFrontLeft = topFrontLeft;
	}

	public HashSet<Point> getTopFrontRight() {
		return TopFrontRight;
	}

	public void setTopFrontRight(HashSet<Point> topFrontRight) {
		TopFrontRight = topFrontRight;
	}

	public HashSet<Point> getTopBackLeft() {
		return TopBackLeft;
	}

	public void setTopBackLeft(HashSet<Point> topBackLeft) {
		TopBackLeft = topBackLeft;
	}

	public HashSet<Point> getTopBackRight() {
		return TopBackRight;
	}

	public void setTopBackRight(HashSet<Point> topBackRight) {
		TopBackRight = topBackRight;
	}

	public HashSet<Point> getBottomFrontLeft() {
		return BottomFrontLeft;
	}

	public void setBottomFrontLeft(HashSet<Point> bottomFrontLeft) {
		BottomFrontLeft = bottomFrontLeft;
	}

	public HashSet<Point> getBottomFrontRight() {
		return BottomFrontRight;
	}

	public void setBottomFrontRight(HashSet<Point> bottomFrontRight) {
		BottomFrontRight = bottomFrontRight;
	}

	public HashSet<Point> getBottomBackLeft() {
		return BottomBackLeft;
	}

	public void setBottomBackLeft(HashSet<Point> bottomBackLeft) {
		BottomBackLeft = bottomBackLeft;
	}

	public HashSet<Point> getBottomBackRight() {
		return BottomBackRight;
	}

	public void setBottomBackRight(HashSet<Point> bottomBackRight) {
		BottomBackRight = bottomBackRight;
	}

	public HashSet<Point> getPoints() {
		return Points;
	}

	public void setPoints(HashSet<Point> points) {
		Points = points;
	}

	public double getSideLength() {
		return SideLength;
	}

	public void setSideLength(double sideLength) {
		SideLength = sideLength;
	}

	public Box(double sideLength, double boxCellLength, double cubeLength) {
		super();
		SideLength = sideLength;
		int n = (int)Math.floor(sideLength/boxCellLength);
		double d=cubeLength/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++) {
					double x=-sideLength/2+i*boxCellLength;
					double y=-sideLength/2+j*boxCellLength;
					double z=-sideLength/2+k*boxCellLength;
					Point point=new Point(x,y,z);
					if(z>d) {
						if(x<-d&&y<-d) {
							this.getTopFrontLeft().add(point);
						}else if(x<-d&&y>-d&&y<d) {
							this.getTopLeft().add(point);
						}else if(x<-d&&y>d) {
							this.getTopBackLeft().add(point);
						}else if(x>-d&&x<d&&y>d) {
							this.getTopBack().add(point);
						}else if(x>d&&y>d) {
							this.getTopBackRight().add(point);
						}else if(x>d&&y>-d&&y<d) {
							this.getTopRight().add(point);
						}else if(x>d&&y<-d) {
							this.getTopFrontRight().add(point);
						}else if(x>-d&&x<d&&y<-d) {
							this.getTopFront().add(point);
						}else {
							this.getTop().add(point);
						}
					}else if(z<d&&z>-d) {
						if(x<-d&&y<-d) {
							this.getFrontLeft().add(point);
						}else if(x<-d&&y>-d&&y<d) {
							this.getLeft().add(point);
						}else if(x<-d&&y>d) {
							this.getBackLeft().add(point);
						}else if(x>-d&&x<d&&y>d) {
							this.getBack().add(point);
						}else if(x>d&&y>d) {
							this.getBackRight().add(point);
						}else if(x>d&&y>-d&&y<d) {
							this.getRight().add(point);
						}else if(x>d&&y<-d) {
							this.getFrontRight().add(point);
						}else if(x>-d&&x<d&&y<-d) {
							this.getFront().add(point);
						}
					}else {
						if(x<-d&&y<-d) {
							this.getBottomFrontLeft().add(point);
						}else if(x<-d&&y>-d&&y<d) {
							this.getBottomLeft().add(point);
						}else if(x<-d&&y>d) {
							this.getBottomBackLeft().add(point);
						}else if(x>-d&&x<d&&y>d) {
							this.getBottomBack().add(point);
						}else if(x>d&&y>d) {
							this.getBottomBackRight().add(point);
						}else if(x>d&&y>-d&&y<d) {
							this.getBottomRight().add(point); 
						}else if(x>d&&y<-d) {
							this.getBottomFrontRight().add(point);
						}else if(x>-d&&x<d&&y<-d) {
							this.getBottomFront().add(point);
						}else {
							this.getBottom().add(point);
						}
					}
					
					if(x>d&&(y==d||y==-d||z==-d||z==d)) {
						this.getRight().add(point);
					}
					if(x<-d&&(y==d||y==-d||z==-d||z==d)) {
						this.getLeft().add(point);
					}
					if(y<-d&&(x==d||x==-d||z==-d||z==d)) {
						this.getFront().add(point);
					}
					if(y>d&&(x==d||x==-d||z==-d||z==d)) {
						this.getBack().add(point);
					}
				}
			}
		}
	}

	public double getBoxCellLength() {
		return BoxCellLength;
	}

	public void setBoxCellLength(double boxCellLength) {
		BoxCellLength = boxCellLength;
	}
	
}
