package RecursionAndDP;

public class RecursiveMultiply {

	public static int recursiveMultiply(int multiplicand, int multiplier){
		
		int result = 0;
		for(int i=0;i<multiplier;i++){
			result = result + multiplicand;
		}
		return result;
	}
	
	
	
	
	
	public static void main(String args){
		System.out.println("Hello World!");
	}
	
	
	int minProduct(int a, int b){
		int bigger = a<b?a:b;
		int smaller = a<b?b:a;
		return minProductHelper(smaller, bigger);
	}
	
	int minProductHelper(int smaller, int bigger){
		
		if(smaller == 0){
			return 0;
		}
		if(smaller==1){
			return bigger;
		}
		
		int s = smaller>>1;
		
		int side1 = minProduct(s,bigger);
		int side2 = side1;
		
		if(smaller%2==1){
			side2 = minProductHelper(smaller-s, bigger);
		}
		return side1+side2;
		
	}
	
	
}
