package RecursionAndDP;

import java.util.ArrayList;

public class EightQueens {
	
	public static int GRID_SIZE = 8;

	
	public static void eightQueens(int row, Integer[] columns, ArrayList<Integer[]> results){
		if(row == GRID_SIZE){
			results.add(columns.clone());
		}else{
			for(int col=0;col<GRID_SIZE;col++){
				if(checkValid(columns, row, col)){
					columns[row] = col;
					eightQueens(row+1, columns, results);
				}
			}
		}
		
		
	}

	
	private static boolean checkValid(Integer[] columns, int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}


	public static void main(String args[]){
		System.out.println("Hello Wordl!");
		
		
		ArrayList<Integer[]> results =  new ArrayList<Integer[]>();
		
		for(int i=0;i<GRID_SIZE;i++){
//			eightQueens(i, columns, results);
			
		}
		
	}
}
