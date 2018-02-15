/**
 * 
 */
package Amazon.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ArunMannuru
 *
 */
/*
 * Combination Sum
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
 * 
 * 
 */
public class CombinationSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 7;
		int[] candidate = {2,3,6,7};
		List<ArrayList<Integer>> val = combinationSum(candidate,target);
		
	}
	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
	    if(candidates == null || candidates.length == 0) return result;
	 
	    ArrayList<Integer> current = new ArrayList<Integer>();
	    Arrays.sort(candidates);
	 
	    combinationSum(candidates, target, 0, current, result);
	 
	    return result;
	}
	 
	public static void combinationSum(int[] candidates, int target, int j, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
	   if(target == 0){
	       ArrayList<Integer> temp = new ArrayList<Integer>(curr);
	       result.add(temp);
	       return;
	   }
	 
	   for(int i=j; i<candidates.length; i++){
	       if(target < candidates[i]) 
	            return;
	 
	       curr.add(candidates[i]);
	       combinationSum(candidates, target - candidates[i], i, curr, result);
	       curr.remove(curr.size()-1); 
	   }
	}

}
