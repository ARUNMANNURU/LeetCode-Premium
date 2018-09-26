/**
 * 
 */
package easy.arrays;

import java.util.HashSet;

/**
 * @author ArunMannuru
 *
 */
/*
 * Contains Duplicate
Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
 *  
 */
public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNums = {1,2,3};
		System.out.println(containsDups(arrNums));
	}
	public static boolean containsDups(int[] arrNums){
		
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int i = 0; i < arrNums.length; i++){
			if(hSet.contains(arrNums[i])){
				return true;
			}
			hSet.add(arrNums[i]);
		}
		return false;
	}
}
