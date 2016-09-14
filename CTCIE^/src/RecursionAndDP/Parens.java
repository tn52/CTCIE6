package RecursionAndDP;

import java.util.ArrayList;

public class Parens {

	public static void parens(int N){
		
		ArrayList<String> ret = new ArrayList<String>();		
		
		recurse(ret, N, N, "");

		for(String s:ret)
			System.out.println(s);
		
	}
	
	
	
	public static void recurse(ArrayList<String> list, int leftCount, int rightCount, String str){
		
		if(leftCount<0 || rightCount<leftCount){
			return;
		}
		
		if(leftCount==0 && rightCount==0){
			String s = String.valueOf(str);
			list.add(s);
			return;
		}
			
		else{
			
			if(leftCount>0){
				str+='(';
				recurse(list, leftCount-1, rightCount, str);
			}
			
			if(leftCount<rightCount){
				str+=")";
				recurse(list, leftCount, rightCount-1, str);			
			}
			
		}
		
	}
	
	
	
	
	public static void main(String args[]){
		
		int N = 3;
		
		parens(3);
		
	}
	
}
