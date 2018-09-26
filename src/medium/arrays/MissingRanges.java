/**
 * 
 */
package medium.arrays;

import java.util.ArrayList;
import java.util.List;

import Amazon.FindDuplicateNumber;

/**
 * @author ArunMannuru
 *
 */
/*
 * Missing Ranges
 * Given a sorted integer array nums, where the range of elements are in the inclusive range [lower, upper], return its missing ranges.
 * Example:
 * Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
 * Output: ["2", "4->49", "51->74", "76->99"]
 * 
 * 
 */
public class MissingRanges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,3,50,75};
		int lower = 0, upper = 99;
		List<String> result = new ArrayList<String>();
		result = findMissingRanges(nums,lower,upper);
		for(String str: result){
			System.out.println(str);
		}
	}
	public static List<String> findMissingRanges(int[] nums, int lo, int up) {
        long lower = ((long)lo)-1;
        long upper = ((long)up)+1;
        List<String> res = new ArrayList<>();
        for(int i=0;i<=nums.length;i++) {
            long next = i == nums.length ? upper : nums[i];
            if(next - lower > 1) {
                String range = createMissingRange(lower+1, next - 1);
                res.add(range);
            }
            lower = next;
        }
        return res;
    }
    
    private static String createMissingRange(long a, long b) {
        return a == b ? String.valueOf(a) : String.format("%d->%d", a, b);
    }

}
