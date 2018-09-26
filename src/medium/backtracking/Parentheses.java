/**
 * 
 */
package medium.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ArunMannuru
 *
 */
/*
 * Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

 * 
 */
public class Parentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> res = generateParenthesis(n);
		for(String result : res){
			System.out.println(result);
		}
	}
	public static List<String> generateParenthesis(int n) {
        List<String> res = generate(2 * n);
        return res;
    }

    private static List<String> generate(int length) {
        List<String> res = new LinkedList<>();
        if (length == 0) {
            res.add("");
            return res;
        }
        if (length == 2) {
            res.add("()");
            return res;
        }
        for (int n = 2; n <= length; n += 2) {
            List<String> sub1 = new LinkedList<>();
            for (String s : generate(n - 2)) {
                sub1.add("(" + s + ")");
            }
            List<String> sub2 = generate(length - n);
            for (String s : sub1) {
                for (String t : sub2) {
                    res.add(s + t);
                }
            }
        }
        return res;
    }
}
