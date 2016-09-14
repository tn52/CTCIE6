package TreesAndGraphs;

import DataStructures.TreeNode;

public class CommonAncestor {

	public static TreeNode commonAncestor(TreeNode root, int a, int b){
		if(root==null)
			return null;
		if(root.val==a || root.val==b)
			return root;
		
		
		boolean AonLeft = covers(root.left, a);
		boolean BonLeft = covers(root.left, b);
		
		if(AonLeft && !BonLeft)
			return root;
		
		TreeNode childSide = AonLeft?root.left:root.right;
		return commonAncestor(childSide, a, b);
	}
	
	
	private static boolean covers(TreeNode right, int a) {
		// TODO Auto-generated method stub
		if(right==null)
			return false;
		if(right.val==a)
			return true;
		
		return covers(right.left, a) || covers(right.right, a);
	}


	public static void main (String args[]){
		
		System.out.println("Hello World!");
		
	}
}
