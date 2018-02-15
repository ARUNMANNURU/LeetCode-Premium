/**
 * 
 */
package Amazon.TreesAndGraphs;

/**
 * @author ArunMannuru
 *
 */
/*
 * Number of Islands
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
 * 
 * 
 * 
 */
public class NumberOfIslands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = new char[][]{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
		System.out.println(numIslands(grid));
	}
	public static int numIslands(char[][] grid) {
	    if(grid==null || grid.length==0||grid[0].length==0)
	        return 0;
	 
	    int m = grid.length;
	    int n = grid[0].length;
	 
	    int count=0;
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            if(grid[i][j]=='1'){
	                count++;
	                merge(grid, i, j);
	            }
	        }
	    }
	 
	    return count;
	}
	 
	public static void merge(char[][] grid, int i, int j){
	    int m=grid.length;
	    int n=grid[0].length;
	 
	    if(i<0||i>=m||j<0||j>=n||grid[i][j]!='1')
	        return;
	 
	    grid[i][j]='X';
	 
	    merge(grid, i-1, j);
	    merge(grid, i+1, j);
	    merge(grid, i, j-1);
	    merge(grid, i, j+1);
	}

}
