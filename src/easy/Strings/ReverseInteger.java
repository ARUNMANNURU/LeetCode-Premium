/**
 * 
 */
package easy.Strings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
 * Input: 123
 * Output:  321
 * Example 2:
 * Input: -123
 * Output: -321
 * Example 3:
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only hold integers within 
 * the 32-bit signed integer range. For the purpose of this problem, assume that your 
 * function returns 0 when the reversed integer overflows.
 * 
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123;
		System.out.println(reverseInteger(x));
	}
	public static int reverseInteger(int x){
		int res = 0;
		while(x > 0){
			res = res*10 + x%10;
			x /= 10;
		}
		return res;
	}
}
