//package TreesAndGraphs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//import DataStructures.Node;
//
//public class RouteBetweenNodes {
//	
//	enum State {Unvisited, Visited, Visiting;}
//	
//	boolean search(Graph g, Node start, Node end){
//		if(start==end)
//			return true;
//		
//		LinkedList<Node> q = new LinkedList<Node>();
//		
//		for(Node u: g.getNodes()){
//			u.state = State.Unvisited;
//		}
//		
//		start.state = Stae.Visiting;
//		q.add(start);
//		Node u;
//		while(!q.isEmpty()){
//			
//			u=q.removeFirst();
//			
//			if(u!=null){
//			
//				for(Node v:u.getAdjacent()){
//				
//					if(v.state == State.Unvisited){
//					
//						if(v==end){
//							return true;
//						}else{
//							v.state = State.Visiting;
//							q.add(v);
//						}
//					}
//				}
//			}
//			u.state = State.Visited;
//		}
//		
//	}
//	
//	
//	public static void main(String args[]){
//			
//		
//	}
//	
//	
////	class Graph{
////		int numV;
////		ArrayList<LinkedList> adjList;
////		
////		public Graph(int v){
////			this.numV = v;
////			adjList = new ArrayList<LinkedList>();
////		}
////		
////		public void addNode(int parent, int child){
////			LinkedList list = adjList.get(parent);
////			adjList.add(parent, child);
////		}
////		
////	}
//}
