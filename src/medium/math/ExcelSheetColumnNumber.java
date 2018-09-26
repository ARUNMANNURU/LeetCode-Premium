/**
 * 
 */
package medium.math;

import java.util.HashMap;

/**
 * @author ArunMannuru
 *
 */
/*
 *  Excel Sheet Column Number

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...

Example 1:

Input: "A"
Output: 1

Example 2:

Input: "AB"
Output: 28

Example 3:

Input: "ZY"
Output: 701


 * 
 */
public class ExcelSheetColumnNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ZY";
		System.out.println(titleToNumber(str));
	}
	public static int titleToNumber(String s) {
	    if(s==null || s.length() == 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    int result = 0;
	    int i = s.length()-1;
	    int t = 0;
	    while(i >= 0){
	        char curr = s.charAt(i);
	        result = result + (int) Math.pow(26, t) * (curr-'A'+1);
	        t++;
	        i--;
	    }
	 
	    return result;
	}
	/*
	 * Second Method
	 */
	public static int titleToNumbers(String s) {
	    if(s==null || s.length() == 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    char c = 'A';
	    for(int i=1; i<=26; i++){
	        map.put(c, i);
	        c += 1; 
	    }
	 
	    int result = 0;
	    int i = s.length()-1;
	    int t = 0;
	    while(i >= 0){
	        char curr = s.charAt(i);
	        result = result + (int) Math.pow(26, t) * map.get(curr);
	        t++;
	        i--;
	    }
	 
	    return result;
	}
}
