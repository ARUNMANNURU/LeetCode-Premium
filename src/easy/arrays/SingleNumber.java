/**
 * 
 */
package easy.arrays;

import java.util.Hashtable;

/**
 * @author ArunMannuru
 *
 */
public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,1,2,2,3,3,4,5,5};
		int len = nums.length;
		System.out.println(singleNum(nums,len));
	}
	public static int singleNum(int[] nums,int len){
		
		if(len == 0 || len == 1)
			return Integer.MIN_VALUE;
		int res = nums[0];
		for(int i = 1; i < len; i++){
			res ^= nums[i];
		}
		return res;
	}
}
