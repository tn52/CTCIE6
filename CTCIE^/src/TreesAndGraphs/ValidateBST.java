package TreesAndGraphs;

import DataStructures.TreeNode;

/**
	 * Implement a function to check if a binary tree is a binary search tree. 
	 * @author guestuser
	 *
	 */
	
public class ValidateBST {
	 static int last_printed;

	
	//this is wrong!!
	public static boolean validateBST(TreeNode root){
		
		if(root==null)
			return true;
			
		else if(root.left==null && root.right==null)
			return true;
		
		else if(root.left==null && root.right!=null && root.val<=root.right.val)
			return true;
		
		else if(root.right==null && root.left!=null && root.val>=root.left.val)
			return true;
		
		else if(root.left.val<=root.val && root.val <=root.right.val)
			return validateBST(root.right) && validateBST(root.left);
		
		else
			return false;	
	}
	
	public static void main(String args[]){
		System.out.println("Hello World!");
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(10);
		
		System.out.println(validateBST(root));
	}
	
	
	public static boolean validateBST_fast(TreeNode root){
		
		if(root==null)
			return true;
		
		if(!validateBST_fast(root.left))
			return false;
		
//		if(last_printed != null && root.val <= last_printed)
//			return false;
		
		last_printed = root.val;
		
		if(!validateBST_fast(root.right))
			return false;
		
		return true;
		
		}
	
}
