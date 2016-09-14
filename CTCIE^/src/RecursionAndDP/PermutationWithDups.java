package RecursionAndDP;

import java.util.ArrayList;
import java.util.HashMap;

public class PermutationWithDups {

	public static void permutationWithDups(HashMap<Character, Integer> map, String prefix, int remaining, ArrayList<String> result){
			
		if(remaining==0){
			result.add(prefix);
			return;
		}
			
		for(Character c:map.keySet()){

			int count = map.get(c);
			if(count>0){
				map.put(c, count-1);
				permutationWithDups(map, prefix+c, remaining-1, result);
				map.put(c, count);
			}
			
		}
		
	}

	
	public static void main(String args[]){
		
		System.out.println("Hello World!");
	
		String str = "aabc";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i=0;i<str.length();i++){
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), 0);				
			}
			map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		
		for(char c:map.keySet())
			System.out.println(c + " " + map.get(c));
		
		permutationWithDups(map, "", str.length(), result);
		
		for(String s:result){
			System.out.println(s);
		}
	}
	
}
