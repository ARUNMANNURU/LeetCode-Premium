/**
 * 
 */
package Amazon;

/**
 * @author ArunMannuru
 *
 */
/*
 * Product of Array Except Self
 * Given an array of n integers where n > 1, nums, 
 * return an array output such that output[i] 
 * is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 * Follow up:
 * Could you solve it with constant space complexity? 
 * (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 * 
 */
public class ProductArrayExceptSelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = {1,2,3,4};
		productArray(arrNum);
	}
	public static void productArray(int[] arrNum){
		int len = arrNum.length;
		int[] result = new int[len]; 
		int left = 1;
		for(int i = 0; i < len; i++){
			if(i > 0){
				left = left*arrNum[i-1];
			}
			result[i]= left;
		}
		int right = 1;
		for(int j = len-1; j >= 0; j--){
			if(j < len-1){
				right = right*arrNum[j+1];
			}
			result[j] *= right;
		}
		for(int x : result){
			System.out.println(x);
		}
	}
}
