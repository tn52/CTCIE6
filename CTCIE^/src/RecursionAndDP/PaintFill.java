package RecursionAndDP;

public class PaintFill {

	
	public static boolean paintFill(Color[][] grid, Color initialColor, Color finalColor, int x, int y){
		
		if(x>grid.length || y>grid[0].length || x< 0 || y<0)
			return false;
		
		if(grid[x][y].R==initialColor.R || grid[x][y].Y==initialColor.Y|| grid[x][y].B==initialColor.B){
		
			grid[x][y].R=finalColor.R;
			grid[x][y].Y=finalColor.Y;
			grid[x][y].B=finalColor.B;
			
			
			paintFill(grid, initialColor, finalColor, x+1, y);
			paintFill(grid, initialColor, finalColor, x-1, y);
			paintFill(grid, initialColor, finalColor, x, y+1);
			paintFill(grid, initialColor, finalColor, x, y-1);
		
		}
		return true;
		
	}
	
	
	
	public static void main(String args[]){
		System.out.println("Hello World!");
		
		Color[][] grid = new Color[10][10];
		
		Color initialColor = new Color(1,1,1);
		Color newColor = new Color(0,0,0);
		Point point = new Point(0,0);
		
		paintFill(grid, initialColor, newColor, 0, 0);
		
		
		
		
		
	}
	
	public static class Point{
		int x;
		int y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static class Color{
		int R;
		int Y;
		int B;
		
		public Color(int r, int y, int b){
			this.R = r;
			this.Y = y;
			this.B = b;
		}
	}
}
