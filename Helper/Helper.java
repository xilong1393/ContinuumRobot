package Helper;
import Initialization.Point;

public class Helper {
	
	public static double dist(Point i, Point j) {
		double x1=i.getX();
		double x2=j.getX();
		double y1=i.getY();
		double y2=j.getY();
		double z1=i.getZ();
		double z2=j.getZ();
		
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
	}
}
