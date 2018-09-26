/**
 * 
 */
package easy.Strings;

/**
 * @author ArunMannuru
 *
 */
/*
 * First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 * 
 */
public class FirstUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "loveleetcode";
		System.out.println(firstUniqueChar(str));
	}
	public static int firstUniqueChar(String str){
		
		char[] ch = str.toCharArray();
		int[] freq = new int[26];
		for(int i = 0; i < str.length(); i++){
			freq[ch[i]-'a']++;
		}
		for(int i = 0; i < str.length(); i++){
			if(freq[ch[i]-'a'] == 1)
				return i;
		}
		return -1;
	}
}
