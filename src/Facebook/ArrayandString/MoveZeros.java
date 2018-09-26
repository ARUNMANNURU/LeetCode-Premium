/**
 * 
 */
package Facebook.ArrayandString;

/**
 * @author ArunMannuru
 *
 */
/*
 *  Move Zeroes
 *  Given an array nums, write a function to move all 0's to the end of it 
 *  while maintaining the relative order of the non-zero elements.
 *  For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
 *  nums should be [1, 3, 12, 0, 0].
 *  Note:
 *  You must do this in-place without making a copy of the array.
 *  Minimize the total number of operations.
 * 
 */
public class MoveZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
	public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) 
        	return;
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
