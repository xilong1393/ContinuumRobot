package Initialization;

import java.util.HashSet;
import java.util.PriorityQueue;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Point> set1=new PriorityQueue<Point>();
		PriorityQueue<Point> set2=new PriorityQueue<Point>();
		Point p= new Point(2,2,2);
		Point p1= new Point(2,2,2);
		//set1.add(p);
		set1.remove(p1);
		//set1.add(p1);
		System.out.print(set1.size());
	}

}
