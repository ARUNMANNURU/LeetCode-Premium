/**
 * 
 */
package medium.sortandsearch;

/**
 * @author ArunMannuru
 *
 */
/*
 * Find Peak Element

A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5 
Explanation: Your function can return either index number 1 where the peak element is 2, 
             or index number 5 where the peak element is 6.

Note:

Your solution should be in logarithmic complexity.

 * 
 */
public class FindPeakElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,3,5,6,4};
		System.out.println(findPeakElement(nums));
	}
	public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end){
            int mid = (end - start) / 2 + start;
            if (nums[mid] < nums[mid + 1]){
                start = mid;
            }
            else if (nums[mid] > nums[mid - 1]) return mid;
            else{
                end = mid;
            }
        }
        if ((start + 1 >= nums.length || nums[start] > nums[start + 1]) && ((start - 1 < 0) ||              nums[start] > nums[start - 1])) return start;
        else return end;
    }
}
