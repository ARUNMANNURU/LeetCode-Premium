/**
 * 
 */
package Facebook.ArrayandString;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ArunMannuru
 *
 */
/*
 * Intersection of Two Arrays II
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * 
 */
public class IntersectionofTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numsOne = {1,2,2,1};
		int[] numsTwo = {2,2};
		int[] res = intersect(numsOne,numsTwo);
		for(int x : res){
			System.out.println(x);
		}
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i: nums1){
	        if(map.containsKey(i)){
	            map.put(i, map.get(i)+1);
	        }else{
	            map.put(i, 1);
	        }
	    }
	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i: nums2){
	        if(map.containsKey(i)){
	            if(map.get(i)>1){
	                map.put(i, map.get(i)-1);
	            }else{
	                map.remove(i);
	            }
	            list.add(i);
	        }
	    }
	 
	    int[] result = new int[list.size()];
	    int i =0;
	    while(i<list.size()){
	        result[i]=list.get(i);
	        i++;
	    }
	 
	    return result;
	}
}
