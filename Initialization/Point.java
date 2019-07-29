package Initialization;

public class Point {
	private double X;
	private double Y;
	private double Z;
	public Point(double d, double e, double f) {
		super();
		this.X = d;
		this.Y = e;
		this.Z = f;
	}
	public double getX() {
		return X;
	}
	public void setX(double x) {
		this.X = x;
	}
	public double getY() {
		return Y;
	}
	public void setY(double Y) {
		this.Y = Y;
	}
	public double getZ() {
		return Z;
	}
	public void setZ(double Z) {
		this.Z = Z;
	}
	
	public String toString() {
		return "["+this.getX()+" "+ this.getY()+" "+this.getZ()+"]";
	}
}
