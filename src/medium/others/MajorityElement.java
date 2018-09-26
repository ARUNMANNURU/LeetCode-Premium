/**
 * 
 */
package medium.others;

/**
 * @author ArunMannuru
 *
 */
/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3

Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2


 */
public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3,2,3};
		System.out.println(majorityElement(num));
	}
	public static int majorityElement(int[] num) {
	       int major=num[0], count = 1;
	        for(int i=1; i<num.length;i++){
	            if(count==0){
	                count++;
	                major=num[i];
	            }else if(major==num[i]){
	                count++;
	            }else count--;
	            
	        }
	        return major;
	}
}
