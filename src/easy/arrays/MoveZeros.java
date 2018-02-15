/**
 * 
 */
package easy.arrays;

/**
 * @author ArunMannuru
 *
 */
public class MoveZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{0,1,3,0,12};
		int len = nums.length;
		moveZeros(nums,len);
	}
	public static void moveZeros(int[] nums,int len){
		int count = 0;
		for(int i =0 ; i < len; i++){
			if(nums[i] != 0){
				nums[count++] = nums[i];
			}
		}
		while(count < len){
			nums[count++] = 0;
		}
		for(int x: nums){
			System.out.println(x);
		}
	}
}
