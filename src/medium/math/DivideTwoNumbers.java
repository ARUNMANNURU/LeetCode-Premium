/**
 * 
 */
package medium.math;

/**
 * @author ArunMannuru
 *
 */
public class DivideTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(10,3));
	}
	public static int divide(int dividend, int divisor) {
        int sign = ((dividend<0) ^ (divisor<0)) ? -1:1;
        long dive = Math.abs((long)dividend);
        long divs = (long)Math.abs((long)divisor);
        long temp = 0;
        long res = 0;
        int res2 = 0;
        
        if (divs == 0) {
            return Integer.MAX_VALUE;
        }
        
        while (dive >= divs) {
            long multiple = 1;
            temp = divs;
            while (dive > (temp<<1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dive -= temp;
            res += multiple;
        }
        res = (sign==1?res:-res);
        if (res > Integer.MAX_VALUE) {
            res2 = Integer.MAX_VALUE;
        } else {
            res2 = (int)res;
        }
        return res2;
    }
}
