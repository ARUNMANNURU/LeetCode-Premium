/**
 * 
 */
package medium.dynamicprogramming;

/**
 * @author ArunMannuru
 *
 */
/*
 * Longest Increasing Subsequence

Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 

Note:

    There may be more than one LIS combination, it is only necessary for you to return the length.
    Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?

 * 
 */
public class LongestIncreasingSubSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(arr));
	}
	public static int lengthOfLIS(int[] nums) {
	     // init dp array to store longestSeq at i
	        int[] dp = new int[nums.length];
	        int res = 0;
	        for (int i = 0; i < nums.length; i++) {
	            dp[i] = 1;
	        }
	        // loop through each element, find the current longestSeq
	        for (int j = 0; j < dp.length; j++) {
	            // at least one 
	            int max = 1;
	            for (int k = 0; k < j; k++) {
	                if (nums[k] < nums[j]) {
	                    // if it is smaller, then it must be one length more
	                    max = Math.max(max, dp[k] + 1);
	                }
	            }
	            dp[j] = max;
	            res = Math.max(dp[j], res);
	        }
	        return res;   
	    }
}
