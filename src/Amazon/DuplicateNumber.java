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
 * prove that at least one duplicate number must exist. 
 * Assume that there is only one duplicate number, find the duplicate one.
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 * 
 */
public class DuplicateNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = {1,2,3,4,5,1};
		int lenA = arrA.length;
		duplicateNum(arrA,lenA);
	}
	public static void duplicateNum(int[] arrA,int lenA){
		
		if(lenA > 1){
			int slow = arrA[0];
			int fast = arrA[arrA[0]];
			while(slow != fast){
				slow = arrA[slow];
				fast = arrA[arrA[fast]];
			}
		}
	
	}
}
