/**
 * 
 */
package Amazon.SortingAndSearching;

import java.util.PriorityQueue;

/**
 * @author ArunMannuru
 *
 */
/*
 * Kth Largest Element in an Array
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note: 
You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 * 
 */
public class KthLargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		int[] arr = {3,2,1,5,6,4};
		System.out.println(findKthLargest(arr,k));
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
