/**
 * 
 */
package medium.sortandsearch;

import java.util.PriorityQueue;

/**
 * @author ArunMannuru
 *
 */
/*
 * Kth Largest Element in an Array

Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5

Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4

Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.

 * 
 */
public class KFrquencyElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(findKthLargest(nums,k));
	}
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
       for(int i: nums){
           q.offer(i);
       if(q.size()>k){
           q.poll();
       }
   }
       return q.peek();
   }
}
