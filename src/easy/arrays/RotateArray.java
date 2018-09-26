/**
 * 
 */
package easy.arrays;

/**
 * @author ArunMannuru
 *
 */
/*
 * Rotate Array
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to 
 * [5,6,7,1,2,3,4].
 * Note:
 * Try to come up as many solutions as you can, 
 * there are at least 3 different ways to solve this problem.
 * 
 * 
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		int[] newArr = rotateArr(arr,k);
		for(int x : newArr){
			System.out.println(x);
		}
	}
	public static int[] rotateArr(int[] arr,int k){
		int len = arr.length-1;
		reverseArr(arr,0,len-k);
		reverseArr(arr,len-k+1,len);
		return reverseArr(arr,0,len);
	}
	public static int[] reverseArr(int[] arr,int start,int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
}
