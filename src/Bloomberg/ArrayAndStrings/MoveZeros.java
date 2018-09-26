/**
 * 
 */
package Bloomberg.ArrayAndStrings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
 * 
 */
public class MoveZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeros(nums);
		for(int x : nums){
			System.out.println(x);
		}
	}
	public static void moveZeros(int[] nums){
		if (nums == null || nums.length <= 1) return;
        int left = 0; 
        int right = 0;
        while (right < nums.length){
            if (nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
	}
}
