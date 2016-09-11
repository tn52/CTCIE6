package GeeksforGeeks;

public class ReverseArraySpecialChars {

	public static String reverseArraySpecialChars(String s){
		
		char[] array = s.toCharArray();
		
		int front = 0;
		int back = array.length-1;
		
		while(front<back){
			
			if(isSpecialChar(array[front])){
				front++;
			}
			else if(isSpecialChar(array[back])){
				back--;
			}
			else{
				char temp = array[front];
				array[front] = array[back];
				array[back] = temp;
			}
			
		}
		
		return array.toString();
		
		
		
	}
	
	
	
	private static boolean isSpecialChar(char c) {
		// TODO Auto-generated method stub
		
		if(!Character.isLetter(c))
			return true;
		return false;
	}



	public static void main(String args[]){
		String s = "a,b$c";
		
		String ret = reverseArraySpecialChars(s);
		
		System.out.println(ret);
		
	}
}
