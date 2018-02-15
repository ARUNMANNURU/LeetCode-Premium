/**
 * 
 */
package Amazon.DynamicProgramming;

/**
 * @author ArunMannuru
 *
 */
/*
 * Climbing Stairs
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Example 1:

Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

 * 
 * 
 */
public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 4, m = 2;
        System.out.println("Nuber of ways = " + countWays(s, m));
	}
	// A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        int res[] = new int[n];
        res[0] = 1; res[1] = 1;
        for (int i=2; i<n; i++)
        {
           res[i] = 0;
           for (int j=1; j<=m && j<=i; j++)
             res[i] += res[i-j];
        }
        return res[n-1];
    }
      
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }
 

}
