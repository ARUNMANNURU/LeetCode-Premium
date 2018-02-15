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
		int[] result = new int[len]; // 1 2 3
		result[len-1] = 1; // result[2] = 1;
		for(int i=len-2; i >= 0; i--){   // 1 0
			result[i] = result[i+1]*arrNum[i+1]; // res[1] = res[2]*res[2] = 9
			  									 // res[0] = res[1]*res[1] = 4
 		}
		int left = 1;
		for(int i=0; i < len; i++){
			result[i] = result[i]*left; // res[0] = res[0] * 1 = 4; res[1] = res[1]*1 = 9*2 = 18; res[2] = res[2]*2 = 
			left = left*arrNum[i]; // left = 1*1; left = 1*2 = 2;
		}
		for(int x: result){
			System.out.println(x);
		}
	}
}
