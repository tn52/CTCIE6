package RecursionAndDP;

import java.util.ArrayList;

public class PermutationsWithoutDups {

//	public static ArrayList<String> list = new ArrayList<String>();
//	
//	public static void permutationsWithoutDups(String constructedWord, String originalWord, int index){
//		
//		if(constructedWord.contains(Character.toString(originalWord.charAt(index)))){
//			return;
//		}
//	
//		if(constructedWord.length()==originalWord.length()){
//			list.add(constructedWord);
//		}
//		
//		constructedWord += Character.toString(originalWord.charAt(index));
//
//		for(int i=0;i<originalWord.length();i++)
//		{
//			permutationsWithoutDups(constructedWord, originalWord, i);
//		}		
//	}
//	
	
	
	
	public static void main(String args[]){
		System.out.println("Hello World!");
//		String originalWord = "abc";
//		for(int i=0;i<originalWord.length();i++){
//			permutationsWithoutDups("", originalWord, i);
//		}
//		
//		for(String s:list)
//			System.out.println(s);
//	
		String originalString = "abcde";
		
		ArrayList<String> list = new ArrayList<String>();
		list = permutationsWithoutDups_DP(originalString);
		
		for(String s:list)
			System.out.println(s);
		
	}
	
	
	public static ArrayList<String> permutationsWithoutDups_DP(String str){

		if(str==null)
			return null;
		
		ArrayList<String> permutations = new ArrayList<String>();			
		
		if(str.length()==0){
			permutations.add("");
			return permutations;
		}
		
//		String a = originalString.substring(0,1);
		char a = str.charAt(0);
		String b = str.substring(1);
		
		ArrayList<String> words = permutationsWithoutDups_DP(b);
					
		for(String s:words){
			for(int i=0;i<=s.length();i++){
				String x = insert(s, a, i);
				permutations.add(x);
			}

		}
				
		return permutations;
		
	}
	
	public static String insert(String s, char c, int index){
		String newString = "";
		newString += s.substring(0,index);
		newString += c;
		newString += s.substring(index, s.length());
		
		
		return newString;
	}
	
	
	
}
