/**
 * 
 */
package Facebook.ArrayandString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ArunMannuru
 *
 */
/*
 * 3Sum
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * Note: The solution set must not contain duplicate triplets.
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * 
 */
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		List<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
		arrList = threeSum(nums);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);// sort array
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length-2; i++) {
            if(i > 0 && (nums[i] == nums[i-1])) 
                continue; // avoid duplicates
        for(int j = i+1, k = nums.length-1; j<k;) {
            if(nums[i] + nums[j] + nums[k] == 0) {
                list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
                while((j < k) && (nums[j] == nums[j-1]))
                    j++;// avoid duplicates
                while((j < k) && (nums[k] == nums[k+1]))
                    k--;// avoid duplicates
            }else if(nums[i] + nums[j] + nums[k] > 0) 
                k--;
            else 
                j++;
        }
    }
    return list;
    }

}
