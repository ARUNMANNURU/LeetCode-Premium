/**
 * 
 */
package Bloomberg.others;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author ArunMannuru
 *
 */
/*
 * Sliding Window Maximum

Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

Example:

Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
Output: [3,3,5,5,6,7] 
Explanation: 

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

Note:
You may assume k is always valid, 1 ≤ k ≤ input array's size for non-empty array.

Follow up:
Could you solve it in linear time?

 */
public class SlidingWindowMaximum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] res = maxSlidingWindow(nums,k);
		for(int x : res){
			System.out.println(x);
		}
	}
	public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k==0) return new int[0];

		//restore the index in deque and keep the index sorted by nums[index] in the deque where the max is at head.
		Deque<Integer> Index = new ArrayDeque<Integer>();
		int[] res = new int[nums.length - k + 1];

		for (int i=0; i<nums.length; i++) {

				//remove the previous item at tail which is smaller than new one, because it cannot be the max in any case for the window.
				while(!Index.isEmpty() && nums[i] >= nums[Index.peekLast()]) Index.removeLast();

				//push the new one in the deque at tail
				Index.addLast(i);

				//remove the old item at head which is out of range, because the one at head is the max we need.
				while(Index.peekFirst()<i-k+1) Index.removeFirst();

		//put the head on in res


				if(i>=k-1) res[i-k+1] = nums[Index.peekFirst()];

		}

		return res;
    }
}
