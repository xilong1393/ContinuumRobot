package Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Helper.Helper;
import Initialization.Box;
import Initialization.Cube;
import Initialization.Point;
import SetCover.CoverPoint;
import SetCover.CoverSet;
import TSP.Edge;
import TSP.EdgeWeightedGraph;
import TSP.LazyPrimMST;
import TSP.Node;
import TSP.Tree;

public class Main {

	public static void main(String[] args) {
		//result list 
		List<Point> list= new ArrayList<Point>();
		List<Integer> orderList=new ArrayList<>();
		
		//set parameters
		double CubeLength=10;
		double CellLength=1;
		double sphereRadius=3;
		double BoxCellLength=2;
		double BoxLength=CubeLength+2*sphereRadius;
		
		//initialization
		Cube cube= new Cube(CubeLength,CellLength);
		Box box=new Box(BoxLength,BoxCellLength,CubeLength);
		CoverSet coverSet= new CoverSet(cube, box, sphereRadius);
		
		//solving set cover
		while(!coverSet.priorityQueue.isEmpty()) 
		{
			CoverPoint cp=coverSet.priorityQueue.poll();
			if(cube.set.size()==0)
				break;
			list.add(cp.getPoint());
			for(Point p:cp.getSet()) {
				for(CoverPoint cPoint :coverSet.priorityQueue) {
					cPoint.getSet().remove(p);
				}
				cube.set.remove(p);
			}
			//refresh priorityQueue
			PriorityQueue<CoverPoint> pq= new PriorityQueue<CoverPoint>();
			for(CoverPoint cPoint :coverSet.priorityQueue) {
				pq.add(cPoint);
			}
			coverSet.priorityQueue=pq;
		}
		
		
		//using prim's algorithm to solve the MST
		int count=list.size();
		EdgeWeightedGraph ewg= new EdgeWeightedGraph(count);
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				Edge e= new Edge(i,j,Helper.dist(list.get(i),list.get(j)));
				ewg.addEdge(e);
			}
		}
		LazyPrimMST lpm= new LazyPrimMST(ewg);
		
		
		//solving TSP with MST
		List<Edge> edgeList=new ArrayList<Edge>();
		
		for(Edge e:lpm.edges())
			edgeList.add(e);
		
		int listCount=edgeList.size();
		Queue<Node> queue=new LinkedList<>();
		HashSet<Integer> set=new HashSet<Integer>();
		
		Node root=new Node(edgeList.get(0).either());
		queue.add(root);
		set.add(root.key);
		
		for(int i=0;i<listCount;i++) {
			
		}
		while(queue.peek()!=null) {
			Node n=queue.poll();
			for(Edge i : edgeList) {
				if(i.other(n.key)!=-1&&!set.contains(i.other(n.key))){
					set.add(i.other(n.key));
					Node j=new Node(i.other(n.key));
					n.list.add(j);
					queue.add(j);
				}
			}
		}
		
		Tree tree=new Tree(root);
		tree.PreOrder(root,orderList);
		
		for(int i:orderList) {
			System.out.println(list.get(i));
		}
	}
}
