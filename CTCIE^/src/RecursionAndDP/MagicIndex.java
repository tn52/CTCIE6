package RecursionAndDP;
	
	/**
	 * A magic index in an array is defined to be an index such that A[i] = i.
	 * Given a sorted array of distinct integers, write a method to find a magic
	 * index, if one exists, in array A. 
	 * FOLLOW UP
	 * What if the values are not distinct? 
	 *
	 */


public class MagicIndex {

	
	public static int magicIndexDistinct(int[] A, int start, int end){
		if(end<start)
			return -1;
		
		int index = (start+end)/2;
		if (A[index]==index)
			return index;
		else if(A[index]>index)
			return magicIndexDistinct(A, start, index-1);
		else if (A[index]<index)
			return magicIndexDistinct(A, index+1, end);

		return 0;
	}
	
	
	
	public static void main(String args[]){
		/**
		 *  - index is always increasing sequentially, but values may skip (even though sorted) 
		 *  - index always starts with 0, but values can start with negative 
		 *  Cases: 
		 *  1. values start higher than 0
		 *  2. values start equal to 0
		 *  3. *values start in the negative
		 * 
		 *  Examples:
		 *  1. 0	1	2	3	4	5	6	7	8	9
		 *  2. -5	-3	0	1	2	4	6	10	12	13
		 *  3. 
		 *  
		 *  Case: not distinct
		 *  Eg.
		 *  1. 0	1	2	3	4	5	6	7	8	9
		 *  2. -5	-3	0	1	2	4	4	4	4	4
		 *  
		 */
	}
}
