package TreesAndGraphs;

import DataStructures.TreeNode;

public class MinimalTree {

	public static TreeNode minimalTree(int[] array, int left, int right){
		
		if(left>right)
			return null;
		
		int mid = (left+right)/2;
		int midElem = array[mid];
		
		
		
		TreeNode root = new TreeNode(midElem);
		
		root.left = minimalTree(array, left, mid);
		root.right = minimalTree(array, mid, right);
		
		return root;
	}
	
	
	public static void main(String args){
		System.out.println("Hello World!");
		
		int[] array = {1,2,3,4,5,6,7,8,9};
	
		TreeNode root = null;
		
		root = minimalTree(array,0, array.length-1);
	}
}
