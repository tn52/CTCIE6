package RecursionAndDP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a method to return all subsets of a set
 * @param {Set} initial set
 * @return {List<Set>} a;; subsets of the initial set
 *
 */
public class PowerSet {
	
	private static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> list) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if (list.size()==0)
			return null;
		
		ArrayList<Integer> first = new ArrayList<Integer>();
		first.add(list.get(0));
		ret.add(list);
		
		if(list.size()==1){
			return ret;
		} 
		
		for(int i=1;i<list.size();i++){
			
			for(ArrayList<Integer> a:ret){
				ArrayList<Integer> duplicate = new ArrayList<Integer>();
				duplicate = a;
				duplicate.add(list.get(i));
				ret.add(duplicate);
			}
			
			ArrayList<Integer> newList = new ArrayList<Integer>();
			newList.add(list.get(i));
			ret.add(newList);
			
			
		}
		
		return ret;
	}
	
	
	public static void main(String args[]){
		/**
		 * Cases: 
		 * 1. empty string --> return 0
		 * 2. not empty
		 * 	Examples
		 * 	a. abc --> 1. a, b, c
		 * 		   --> 2. ab, bc, ac
		 * 		   --> 3. abc
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(3);
		
		ArrayList<ArrayList<Integer>> ret = powerSet(list);
		
		int length = ret.size();
		for(int i=0;i<length;i++){
			for(int x:ret.get(i))
				System.out.println(x+ " ");
			System.out.println();
		}	
	}
	
	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size() == index){
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		}else{
			allsubsets = getSubsets(set, index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:allsubsets){
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
		
		return null;
	}
	
	ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << set.size();
		
		for(int k=0;k<max;k++){
			ArrayList<Integer> subset = convertIntToSet(k, set);
			allsubsets.add(subset);
		}
		return allsubsets;
	}


	private ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set) {
		ArrayList<Integer> subset = new ArrayList<Integer>();
		int index =0;
		for(int k=x;k>0;k>>=1){
			if((k&1)==1)
				subset.add(set.get(index));
			index++;
			
		}
		
		
		return subset;
	}
	
	
}
