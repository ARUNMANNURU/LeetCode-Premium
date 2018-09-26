/**
 * 
 */
package Bloomberg.ArrayAndStrings;

/**
 * @author ArunMannuru
 *
 */
/*
 * First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters. 
 * 
 * 
 */
public class FirstUniqueCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}
	public static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[ch[i]-'a']++;
        }
        for(int j = 0; j < s.length(); j++){
            if(arr[ch[j]-'a'] == 1)
                return j;
        }
        return -1;
    }
}
