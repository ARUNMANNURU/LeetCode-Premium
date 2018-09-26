/**
 * 
 */
package medium.btressinorder;

/**
 * @author ArunMannuru
 *
 */
/*
 * Number of Islands

Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1

Example 2:

Input:
11000
11000
00100
00011

Output: 3


 */
public class NumberOfIslands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static final char flag='X';
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=m==0?0:grid[0].length;
        int cnt=0;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (grid[i][j]=='1') {
                    cnt++;
                    dfs(grid,i,j,m,n);
                }
            }
        }
        return cnt;
    }
    
    void dfs(char[][] grid, int i, int j, int m, int n) {
        if (i<0||i==m||j<0||j==n) {
            return;
        }
        if (grid[i][j]=='1') {
            grid[i][j]=flag;
            dfs(grid,i-1,j,m,n);
            dfs(grid,i+1,j,m,n);
            dfs(grid,i,j-1,m,n);
            dfs(grid,i,j+1,m,n);
        }
    }   

}
