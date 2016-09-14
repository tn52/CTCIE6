package RecursionAndDP;

public class Coins {

	public static int coins(int N, int[] denoms, int index){
		
		if(index>=denoms.length)
			return 1;
		
		int ways = 0;
		int val = denoms[index];

		for(int i=0;i*val<N;i++){		
			ways += coins(N-i*val, denoms, index+1);
		}
		
		return ways;	
	}
	
	public static void main(String args[]){
		System.out.println("Hello World");
		
		int[] denoms = {25,10,5,1};
		
		int originalValue = 100;
		
		int numWays = coins(originalValue, denoms, 0);
		
		System.out.println(numWays);
		
	}
	
	public static int coins_DP(int originalValue, int[] denoms, int index){
		
		int[][]DP = new int[index][originalValue];
		
		for(int i=0;i<index;i++){
			DP[i][0] = 0;
		}
		
		
		
		
		for(int i=0;i<index;i++){
			
			
			
			
		}
		
		
		
		return 0;
	}
	
}
