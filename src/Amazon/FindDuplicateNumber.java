/**
 * 
 */
package Amazon;

/**
 * @author ArunMannuru
 *
 */
/*
 * Find the Duplicate Number
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), 
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number, 
 * find the duplicate one.
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 * 
 */
public class FindDuplicateNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = {1,2,3,1,4};
		int len = arrNum.length;
		System.out.println(findDup(arrNum,len));
	}
	public static int findDup(int[] nums,int len){
		int fast = 0, slow = 0;
		do{
	        slow = nums[slow];
	        fast = nums[nums[fast]];
	    } while(slow != fast);
	 
	    int find = 0;
	 
	    while(find != slow){
	        slow = nums[slow];
	        find = nums[find];
	    }
	    return find;
	}

}
