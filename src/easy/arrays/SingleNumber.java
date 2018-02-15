/**
 * 
 */
package easy.arrays;

import java.util.Hashtable;

/**
 * @author ArunMannuru
 *
 */
public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,1,2,2,3,3,4,5,5};
		int len = nums.length;
		singleNum(nums,len);
	}
	public static void singleNum(int[] nums,int len){
		Hashtable<Integer,Integer> hTable = new Hashtable<Integer,Integer>();
		int count = 0;
		for(int i =0; i < len; i++){
			count++;
			if(hTable.containsKey(nums[i])){
				count++;
				hTable.put(nums[i], count);
			}
			hTable.put(nums[i], count);
			count = 0;
		}
		for (Integer value : hTable.keySet()) 
        {
            // search  for value
			if(hTable.get(value) == 1){
				System.out.println(value);
			}
         }
	}
}
