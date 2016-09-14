package DataStructures;

import java.util.LinkedList;

public class Graph {

	public int v;
	public LinkedList<Integer>[] adjList;
	
	public Graph(int v){
		this.v = v;
		adjList = new LinkedList[v];
		for(int i=0;i<v;i++){
			adjList[i] = new LinkedList<Integer>();
		}
	}
}
