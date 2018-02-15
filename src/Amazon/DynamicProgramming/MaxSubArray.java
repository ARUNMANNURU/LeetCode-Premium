/**
 * 
 */
package Amazon.DynamicProgramming;

/**
 * @author ArunMannuru
 *
 */
/*
 * Maximum Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 */
public class MaxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
	public static int maxSubArray(int[] A) {
		          int[] sum = new int[A.length];
		          
		          int max = A[0];
		          sum[0] = A[0];
		   
		          for (int i = 1; i < A.length; i++) {
		              sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
		              max = Math.max(max, sum[i]);
		         }
		  
		         return max;
     }


}
