/**
 * 
 */
package Bloomberg.others;

/**
 * @author ArunMannuru
 *
 */
/*
 * Sqrt(x)

Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2

Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.


 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(4));
	}
	public static int mySqrt(int x) {
	     // Base Cases
	        if (x == 0 || x == 1)
	            return x;
	 
	        // Do Binary Search for floor(sqrt(x))
	        int start = 1, end = x, ans=0;
	        while (start <= end)
	        {
	            int mid = (start + end) / 2;
	 
	            // If x is a perfect square
	            if (mid*mid == x)
	                return mid;
	 
	            // Since we need floor, we update answer when mid*mid is
	            // smaller than x, and move closer to sqrt(x)
	            if (mid*mid < x)
	            {
	                start = mid + 1;
	                ans = mid;
	            }
	            else   // If mid*mid is greater than x
	                end = mid - 1;
	        }
	        return ans; 
	}
}
