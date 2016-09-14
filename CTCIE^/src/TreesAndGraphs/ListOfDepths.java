package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

import DataStructures.TreeNode;

public class ListOfDepths {

	
	public static void listOfDepths_DFS(TreeNode root, int level, ArrayList<LinkedList<TreeNode>> ret){
		
		if(root==null)
			return;
		
		if(ret.size()==level){
			LinkedList<TreeNode> current = new LinkedList<TreeNode>();
			current.add(root);
			ret.add(current);
		}else{
			LinkedList<TreeNode> current = ret.get(level);
			current.add(root);
		}
		listOfDepths_DFS(root.left, level+1, ret);
		listOfDepths_DFS(root.right, level+1, ret);
		
		return;
		
	}
	
	
	
	public static void main(String args[]){
		System.out.println("Hello World!");
		
		TreeNode root = new TreeNode(1);
		
		ArrayList<LinkedList<TreeNode>> ret = new ArrayList<LinkedList<TreeNode>>();
		
		listOfDepths_DFS(root, 0, ret);
		
		
		ret = listOfDepths_BFS(root);
	}
	
	
	public static ArrayList<LinkedList<TreeNode>> listOfDepths_BFS(TreeNode root){
		
		if(root==null)
			return null;
		
		ArrayList<LinkedList<TreeNode>> ret = new ArrayList<LinkedList<TreeNode>>();
		
		LinkedList<TreeNode> q = new LinkedList<TreeNode>();		
		q.add(root);
		ret.add(q);
		
		
		while(!q.isEmpty()){

			LinkedList<TreeNode> q2 = new LinkedList<TreeNode>();	

			for(TreeNode temp:q){
				
				q2.add(temp.left);
				q2.add(temp.right);
			}
			ret.add(q2);
			
			q = q2;

		}
		
		
		return ret;
		
	}
}
