/**
 * 
 */
package easy.Strings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Valid Anagram
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? 
 * How would you adapt your solution to such case?
 * 
 */
public class ValidAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOne = "anagram";
		String strTwo = "nagaram";
		System.out.println(validAnagram(strOne,strTwo));
	}
	public static boolean validAnagram(String strOne,String strTwo){
		int lenOne = strOne.length()-1;
		int lenTwo = strTwo.length()-1;
		int sum = 0;
		int[] freq = new int[26];
		char[] chOne = strOne.toCharArray();
		char[] chTwo = strTwo.toCharArray();
		if(lenOne != lenTwo)
			return false;
		for(int i = 0; i < lenOne; i++){
			freq[chOne[i]-'a']++;
		}
		for(int i = 0; i < lenTwo; i++){
			freq[chTwo[i]-'a']--;
		}
		for(int x : freq){
			sum = sum+x;
			if(sum == 0)
				return true;
		}
		return false;
	}
}
