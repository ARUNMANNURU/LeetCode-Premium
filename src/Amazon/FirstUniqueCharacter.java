/**
 * 
 */
package Amazon;

/**
 * @author ArunMannuru
 * 
 * Given a string, find the first non-repeating character in it and return it's index. 
 * If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 *
 *
 *run-time :- O(n)
 */
public class FirstUniqueCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "leetcode";
		System.out.println(firstUnique(strA));
	}
	public static int firstUnique(String strA){
		int[] freArray = new int[26];
		for(int i=0; i< strA.length(); i++){
			freArray[strA.charAt(i)-'a']++;
		}
		for(int j=0; j < strA.length(); j++){
			if(freArray[strA.charAt(j)-'a'] == 1)
				return j;
		}
		return -1;
	}
}
