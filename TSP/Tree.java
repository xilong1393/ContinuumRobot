package TSP;

import java.util.List;

public class Tree {
	Node root; 
    Tree() 
    { 
        this.root = null; 
    } 
  
    public Tree(Node root) 
    { 
        this.root = root; 
    } 
    public void PreOrder(Node node, List<Integer> resultList) 
    { 
        if (node == null) 
            return; 
        /* then store the the data of node to a list*/
        resultList.add(node.key); 
        
        for(Node n:node.list)
        	PreOrder(n,resultList);
    } 
}
