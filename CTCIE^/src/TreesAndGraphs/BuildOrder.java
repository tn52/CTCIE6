package TreesAndGraphs;

import java.util.Stack;

import DataStructures.Graph;

public class BuildOrder {

	public static void buildOrder(Graph g){
		
		Stack stack = new Stack();
		boolean[] visited = new boolean[g.v];
		for(boolean b:visited)
			b = false;
		
		for(int i=0;i<g.v;i++){
			visited[i] = true;
			recurse(g, i, visited, stack);
			stack.push(i);	
		}
		
	}
	
	public static void recurse(Graph g, int i, boolean visited[], Stack stack){
		
		if(g.adjList[i] == null)
			return;
		
		int current = i;
		for(int j:g.adjList[i]){
			if(visited[j] = false){
				visited[j] = true;
				recurse(g, j, visited, stack);
				stack.push(j);
			}
		}
	
		return;
	}
	
	
	public static void main(String args[]){
		System.out.println("Hello World!");
		
		
	}
}
