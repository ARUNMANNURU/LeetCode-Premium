/**
 * 
 */
package Amazon;

import java.util.HashMap;

/**
 * @author ArunMannuru
 *
 */
/*
 * Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,return [0, 1].
 * 
 * 
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = {2,11,7,15};
		int target = 9;
		twoSum(arrNum,target);
	}
	public static void twoSum(int[] arrNum,int target){
		HashMap<Integer,Integer> hTable = new HashMap<Integer,Integer>();
		int[] arrFinal = new int[]{0,0};
		for(int i=0; i < arrNum.length; i++){
			if(hTable.containsKey(arrNum[i])){
				arrFinal = new int[]{hTable.get(arrNum[i]),i};
			}else{
				hTable.put(target-arrNum[i], i);
			}
		}
		for(int x: arrFinal){
			System.out.println(x);
		}
	}
}
