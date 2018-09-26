/**
 * 
 */
package Bloomberg.ArrayAndStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ArunMannuru
 *
 */
/*
 * Intersection of Two Arrays

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:

    Each element in the result must be unique.
    The result can be in any order.

 * 
 */
public class IntersectionOfTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 ={1,2,2,1};
		int[] nums2 ={2,2};
		int[] res = intersection(nums1,nums2);
		for(int x : res){
			System.out.println(x);
		}
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0 || nums1 == null || nums2 == null) 
        	return new int[]{};
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int num : nums1) 
        	set.add(num);
        for(int num : nums2){ 
        	if(set.contains(num)) 
        		res.add(num); 
        }
	//Return the result
        int[] result = new int[res.size()];
        int i = 0;
        for(int e :  res) 
        	result[i++] = e;
        return result;
	}
}
