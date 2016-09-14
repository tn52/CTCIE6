package Hard;

import java.util.Arrays;

/**
 * Design an algorithm that finds the smallest K numbers in a array
 * @author guestuser
 *
 */

public class SmallestK {

	public static void main(String args[]){
		int[] array = {6,3,5,8,0,34,4,6};
		int k = 4;
//		smallestK_sort(array, k);		
		smallestK_partition(array, k, 0, array.length-1);
	}

	private static int smallestK_partition(int[]array, int k, int left, int right){
		
		int partition = partition(array, 0, array.length-1);
		
		while(partition!=k){
			if(partition>k)
				partition = smallestK_partition(array, k, left, partition);
			
			else
				partition = smallestK_partition(array, k, partition, right);
			
			
		}
		
		for(int i=0;i<k;i++)
			System.out.println(array[k]);
		return partition;
		
	}
	
	/**
	 * This method takes the right parameter and sets that value as the partition, places it in its correct
	 * position in the array, and puts all int smaller on the left and all ints larger on the right
	 * @param array
	 * @param left
	 * @param right
	 * @return
	 */
	private static int partition(int[] array, int low, int high){

		int pivot = array[high];
		
		int i=low-1;

		for(int j=0;j<array.length;j++){
			
			if(array[j] <= pivot){
				i++;
				swap(array, i, j);
				
			}
		}
		
		swap(array, i+1, high);
			
		return i+1;
	}
	
	
	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

	private static void smallestK_sort(int[] array, int k) {
		
		if(array==null || array.length==0)
			System.out.println("null or empty array");
		
		if(k>=array.length){
			for(int i:array)
				System.out.println(i);
		}
			
		else
		{
			Arrays.sort(array);
			for(int i=0;i<k;i++){
				System.out.println(array[i]);
			}
		}
		
		
	}
}
