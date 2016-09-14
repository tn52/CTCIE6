package TreesAndGraphs;

import DataStructures.TreeNode;

public class CheckBalanced {

	public boolean checkBalanced_slow(TreeNode root){
		
		if(root==null)
			return true;
		
		int heightLeft = getHeight(root.left);
		int heightRight = getHeight(root.right);
		
		if(Math.abs(heightLeft - heightRight) > 1)
			return false;
		else
			return checkBalanced_slow(root.left) && checkBalanced_slow(root.right);
	}
	
	
	private int getHeight(TreeNode root) {

		if(root==null)
			return 0;
		
		return 1 + max(getHeight(root.left), getHeight(root.right));
	}

	private int max(int left, int right) {
		return left>right?left:right;
	}


	public static void main(String args[]){
		
		
	}
	
	public int checkBalanced_fast(TreeNode root){
		if(root==null)
			return 0;
		
		int leftHeight = checkBalanced_fast(root.left);
		if(leftHeight==-1)
			return -1;
		
		int rightHeight = checkBalanced_fast(root.right);
		if(rightHeight==-1)
			return -1;
		
		if(Math.abs(leftHeight-rightHeight)>1)
			return -1;
		else 
			return Math.max(leftHeight, rightHeight) + 1;
	
	}
}
