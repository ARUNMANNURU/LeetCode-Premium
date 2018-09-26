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
		int[] arrA = {1,2,3,4,5,3};
		int len = arrA.length-1;
		int n = dupNum(arrA);
		System.out.println(n - (len*(len+1))/2);
		System.out.println(duplicateNum(arrA));
		
	}
	public static int duplicateNum(int[] arrA){
		int slow = 0, fast = 0, finder = 0;
		while(true){
			slow = arrA[slow];
			fast = arrA[arrA[slow]];
			if(slow == fast)
				break;
		}
		while(true){
			slow = arrA[slow];
			finder = arrA[finder];
			if(slow == finder)
				return arrA[slow];
		}
	}
	public static int dupNum(int[] arrA){
		int sum = 0;
		for(int x : arrA){
			sum += x;
		}
		return sum;
	}
	
}
