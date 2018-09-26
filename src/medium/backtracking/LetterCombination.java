/**
 * 
 */
package medium.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ArunMannuru
 *
 */
/*
 * Letter Combinations of a Phone Number

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.

 * 
 */
public class LetterCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}
	 public static List<String> letterCombinations(String digits) {
		 if (digits.length() == 0)
	            return new ArrayList<String>();
	        String[] s = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        List<String> res = new ArrayList<>();
	        helper(s, res, new StringBuilder(), digits);
	        return res;
	    }
	    
	    private static void helper(String[] s, List<String> res, StringBuilder sb, String digits){
	        if (sb.length() == digits.length()){
	            String str = new String(sb);
	            res.add(str);
	            return;
	        }
	        
	        char[] ch = s[digits.charAt(sb.length()) - '0'].toCharArray();
	        for (int i = 0; i < ch.length; i++){
	            sb.append(ch[i]);
	            helper(s, res, sb, digits);
	            sb.deleteCharAt(sb.length() - 1);
	        }
	    }
}
