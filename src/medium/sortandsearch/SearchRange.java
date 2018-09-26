/**
 * 
 */
package medium.sortandsearch;

/**
 * @author ArunMannuru
 *
 */
/*
 * Search for a Range

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 * 
 */
public class SearchRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] res = searchRange(nums,target);
		for(int x : res){
			System.out.println(x);
		}
	}
	public static int[] searchRange(int[] nums, int target) {
	     int lo = 0, hi = nums.length - 1;
	        while (lo <= hi) {
	            int mid = lo + (hi - lo) / 2;
	            if (nums[mid] == target) {
	                int left = mid, right = mid;
	                // Advance left to the left as long as nums[left] == target
	                while (left >= 0 && nums[left] == nums[mid]) left--;
	                // Advance right to the ring as long as nums[right] == target
	                while (right <= nums.length - 1 && nums[right] == nums[mid]) right++;
	                return new int[] {left + 1, right - 1};
	            } else if (nums[mid] > target) {
	                hi = mid - 1;
	            } else {
	                lo = mid + 1;
	            }
	        }
	        return new int[] {-1, -1};
	    }

}
