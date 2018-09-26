/**
 * 
 */
package easy.arrays;

import java.util.HashSet;

/**
 * @author ArunMannuru
 *
 */
/*
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Example:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 *
 */
public class RemoveDups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = new int[]{1,2,3};
		System.out.println(removeDups(arrA));
	}
	public static int removeDups(int[] nums){
		int len = nums.length;
		int index = 1;
		if(len < 2){
			return len;
		}
		for(int i = 1; i < len; ++i){
			if(nums[i] != nums[i-1]){
				nums[index++] = nums[i];
			}
		}
		return index;
	}
}
