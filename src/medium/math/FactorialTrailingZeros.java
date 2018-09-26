/**
 * 
 */
package medium.math;

/**
 * @author ArunMannuru
 *
 */
/*
 * Factorial Trailing Zeroes
 * Given an integer n, return the number of trailing zeroes in n!.
 * Example 1:
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 * 
 * 
 */
public class FactorialTrailingZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(12));
	}
	public static int trailingZeroes(int n) {

        if(n>=5){
            return n/5 + trailingZeroes(n/5);
        }
        else{
            return 0;
        }       
    }
}
