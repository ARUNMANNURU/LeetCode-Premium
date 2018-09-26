/**
 * 
 */
package medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ArunMannuru
 *
 */
/*
 *3Sum
 *Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 *Find all unique triplets in the array which gives the sum of zero.
 *Note: The solution set must not contain duplicate triplets.
 *For example, given array S = [-1, 0, 1, 2, -1, -4],
 *A solution set is:
 *[
  [-1, 0, 1],
  [-1, -1, 2]
  ] 
 * 
 */
public class UniqueTriplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrN = {-1,0,1,2,-1,-4};
		List<List<Integer>> alist = tripleSum(arrN);
		for(List<Integer> x : alist){
			System.out.println(x);
		}
	}
	public static List<List<Integer>> tripleSum(int[] arrN){
		Arrays.sort(arrN);
		int len = arrN.length;
		int i = 0;
		List<List<Integer>> tripleSum = new ArrayList<List<Integer>>();
		for(i = 0; i < len-2; i++)
			if(i > 0 && (arrN[i] == arrN[i-1]))
				continue;
		 for(int j = i+1, k = arrN.length-1; j<k;) {
	            if(arrN[i] + arrN[j] + arrN[k] == 0) {
	            	tripleSum.add(Arrays.asList(arrN[i],arrN[j],arrN[k]));
	                j++;
	                k--;
	                while((j < k) && (arrN[j] == arrN[j-1]))
	                    j++;// avoid duplicates
	                while((j < k) && (arrN[k] == arrN[k+1]))
	                    k--;// avoid duplicates
	            }else if(arrN[i] + arrN[j] + arrN[k] > 0) 
	                k--;
	            else 
	                j++;
	        }
		 return tripleSum;
	}
}
