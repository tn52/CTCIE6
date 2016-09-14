package RecursionAndDP;

import java.util.ArrayList;
import java.util.HashMap;

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
	
	
	//Cracking the coding interview solution
	
	ArrayList<Coordinate> getPath (boolean[][] maze){
		if(maze==null || maze.length==0)
			return null;
		HashMap<Coordinate, Boolean> cache = new HashMap<Coordinate, Boolean>();
		ArrayList<Coordinate> path = new ArrayList<Coordinate>();
		if(getPath(maze, maze.length-1, maze[0].length-1, path, cache)){
			return path;
		}
		
		return null;
	}


	private boolean getPath(boolean[][] maze, int i, int j, ArrayList<Coordinate> path2, HashMap<Coordinate, Boolean> cache) {
		if(i<0 || j<0 || !maze[i][j])
			return false;
		
		Coordinate c = new Coordinate(i,j);
		if(cache.containsKey(c))
			return cache.get(c);
		
		
		
		if(i==0&&j==0 || getPath(maze, i-1,j,path2, cache) || getPath(maze, i,j-1,path2, cache)){
			path2.add(c);
			cache.put(c, true);
			return true;
		}
		
		cache.put(c, false);
		return false;
	}
	
	
	
}
