package TSP;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public int key; 
    public List<Node> list;
  
    public Node(int item) 
    { 
        key = item; 
        list=new ArrayList<Node>();
    } 
}
