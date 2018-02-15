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
		int[] arrA = new int[]{1,1,2};
		System.out.println(removeDups(arrA));
	}
	public static int removeDups(int[] nums){
		// Length of an array.	
		int length=nums.length;
		// if array contains only one element case.
	      if(length==0 || length==1) 
	          return length;
	      int i=1; 
	      for(int j=1; j<length; j++) {
	        if(nums[j]!=nums[j-1]){
	          nums[i]=nums[j]; 
	          i++; 
	        }
	      }
	      if(i<length) 
	          nums[i]='\0';
	      return i; 
	}
}
