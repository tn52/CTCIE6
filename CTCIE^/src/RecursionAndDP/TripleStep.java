package RecursionAndDP;
/**
 * A child is running up a staircase with n steps and can hop either 
 * 1 step, 2 steps or 3 steps at a time. Implement a method to count 
 * how many possible ways the child can run up the stairs.
 * @param {int} n - number of steps
 * @return {int} number of ways child can run up the stairs 
 */

public class TripleStep {

	//Naive recursion
	public static int tripleStepR(int n){
	
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		
		return tripleStepR(n-1) + tripleStepR(n-2) + tripleStepR(n-3);
		
	}
	
	//DP
	public static int tripleStepDP(int n){
		
		//let A be the number of ways 
		int[] A = new int[n+1];
		
		A[0] = 0;
		A[1] = 1;
		A[2] = 2;
		A[3] = 4;
		for(int i=4;i<n+1;i++){
			A[i] = A[i-1] + A[i-2] + A[i-3];
		}
		
		return A[n];
	
	}	
	
	public static void main(String args[]){
		/**
		 * examples:
		 * if n = 0, ret 0
		 * if n = 1, ret 1
		 * if n = 2, ret 2 (2, 1+1)
		 * if n = 3, ret 4 (3, 2+1, 1+2, 1+1+1)
		 * if n = 4, ret 7 (3+1, 2+2, 2+1+1, 1+3, 1+2+1, 1+1+2, 1+1+1+1) 
		 */
		System.out.println(tripleStepDP(6));		
		System.out.println(tripleStepR(6));		
	}
	
	
	
}
