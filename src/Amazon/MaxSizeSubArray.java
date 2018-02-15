/**
 * 
 */
package Amazon;

import java.util.HashMap;

/**
 * @author ArunMannuru
 *
 */
public class MaxSizeSubArray {

	/**
	 * @param args
	 */
	/*
	 * Maximum Size Subarray Sum Equals k
	 * Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead
	 * Note:
	 * The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.
	 * Example 1:
	 * Given nums = [1, -1, 5, -2, 3], k = 3,
	 * return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)
	 * Example 2:
	 * Given nums = [-2, -1, 2, 1], k = 1,
	 * return 2. (because the subarray [-1, 2] sums to 1 and is the longest)
	 * Follow Up:
	 * Can you do it in O(n) time?
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,-1,5,-2,3};
		int k = 3;
		System.out.println(maxSubArrayLen(arr,k));
	}
	public static int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, max = 0;
        int len = nums.length;
        HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < len; i++){
        	sum = sum + nums[i];
        	if(sum == k)
        		max = i+1;
        	else if(hMap.containsKey(sum - k))
        			max = Math.max(max, i-hMap.get(sum-k));
        	if(!hMap.containsKey(sum))
        		hMap.put(sum,i);
        }
		return max;
    }
}
