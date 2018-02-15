/**
 * 
 */
package Amazon;

/**
 * @author ArunMannuru
 *
 */
public class LongestPalindrome {

	/**
	 * @param args
	 */
	/*
	 * Longest Palindromic Substring
	 * Given a string s, find the longest palindromic substring in s. 
	 * You may assume that the maximum length of s is 1000.
	 * Example:
	 * Input: "babad"
	 * Output: "bab"
	 * Note: "aba" is also a valid answer.
	 * Example:
	 * Input: "cbbd"
	 * Output: "bb"
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		int start = 0, end = 0, max = 0;
		char[] ch = str.toCharArray();
		int len = ch.length;
		for(int i=0; i < len; i++){
			if(isPal(ch,i-max-1,i)){
				start = i-max-1;
				end = i;
				max += 2;
			}else if(isPal(ch,i-max,i)){
				start = i-max;
				end = i;
				max += 1;
			}
		}
		System.out.println(str.substring(start, end+1));
	}
	public static boolean isPal(char[] ch,int start,int end){
		if(start < 0)
			return false;
		while(start < end){
			if(ch[start++] != ch[end--])
				return false;
		}
		return true;
	}
}
