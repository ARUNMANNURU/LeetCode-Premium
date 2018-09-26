/**
 * 
 */
package medium.others;

/**
 * @author ArunMannuru
 *
 */
/*
 * Sum of Two Integers
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3. 
 * 
 */
public class SumofTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(2,4));
	}
	public static int getSum(int a, int b){
	    if(a == 0) 
	    	return b;
	    int x = a ^ b;
	    int c = (a & b) << 1;
	    return getSum(c, x);
	}
}
