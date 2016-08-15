package RecursionAndDP;

import java.util.ArrayList;

import DataStructures.Coordinate;

public class RobotinaGrid {
	/**
	 * Imagine a robot sitting on the upper left corner of grid with r rows and c columns. 
	 * The robot can only move in two directions, right and down, but certain cells are
	 * "off limits" such that the robot cannot step on them. Design an algorithm to find a
	 * path for the robot from the top left to the bottom right. 
	 * 
	 * @param {int} r - number of rows 
	 * @param {int} c - number of columns
	 * @param {ArrayList<Coordinate>} list of off limit coordinates
	 * @return {ArrayList<Coordinate>} list of coordinates representing path
	 */
	
	static ArrayList<Coordinate> offLimit = new ArrayList<Coordinate>();
	static ArrayList<Coordinate> path = new ArrayList<Coordinate>();
	
	static int numRows = 3;
	static int numCols = 3;
	
	
	public static boolean robotGrid(int r, int c, ArrayList<Coordinate> path){
		
		//Negative base case, 
		if(isOffLimit(r,c) || r<0 || r>=numRows || c<0 || c>=numCols){
			return false;
		}
		
		//Robot reached the end
		if(r==numRows-1 && c==numCols-1){
			path.add(new Coordinate(r,c));
			return true;
		}
		
		if(robotGrid(r+1, c, path) || robotGrid(r, c+1, path)){
			path.add(new Coordinate(r,c));
			return true;
		}
		
		return false;
	}
	
	
	public static boolean robotGridDP(int r, int c, ArrayList<Coordinate> path){
		boolean[][] A = new boolean[numRows][numCols];
		A[0][0] = true;
		
		
		return false;
	}
	
	
	public static void main(String args[]){
		/**
		 * start at position 0,0 (top left), aim to reach r,c
		 * 
		 */
		offLimit.add(new Coordinate(2,1));
		offLimit.add(new Coordinate(1,1));
//		offLimit.add(new Coordinate(1,2));

		boolean ret = robotGrid(0, 0, path);
		for(Coordinate c:path){
			System.out.println(c.y + " "+ c.x);
		}
		System.out.println(ret);
	}
	
	
	public static boolean isOffLimit(int r, int c){
		for(Coordinate coord:offLimit){
			if(coord.y==r && coord.x==c)
				return true;
		}
		return false;
		
	}
	
	
	
}
