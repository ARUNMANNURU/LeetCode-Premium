/**
 * 
 */
package medium.backtracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * @author ArunMannuru
 *
 */
/*
 * Permutations

Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]


 * 
 */
public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(permute(nums));
	}
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        int l = nums.length;
        if(nums == null || l == 0)
            return permutations;
        
        //do a bfs starting from each num
        Queue<List<Integer>> paths = new ArrayDeque<>();
        for(int n: nums) {
            paths.offer(Arrays.asList(n));
        }
        
        while(!paths.isEmpty()) {
            List<Integer> next = paths.poll();
            if(l == next.size()) {
                permutations.add(next);                
                continue;
            }
            
            for(int n: nums) {
                if(!next.contains(n)) {
                    List<Integer> u = new ArrayList<>(next);
                    u.add(n);
                    
                    paths.offer(u);
                }
            }
        }
        
        return permutations;
    }
}
