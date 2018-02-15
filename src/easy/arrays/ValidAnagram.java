/**
 * 
 */
package easy.arrays;

import java.util.Arrays;

/**
 * @author ArunMannuru
 *
 */
public class ValidAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "nagaram";
		String str2 = "anagram";
		System.out.println(isValid(str1,str2));
	}
	public static boolean isValid(String str1,String str2){
		
		int[] charCount = new int[26];
		int lenOne = str1.length();
		int lenTwo = str2.length();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		if(lenOne != lenTwo){
			return false;
		}else{
			for(int i = 0 ; i < lenOne; i++){
				charCount[ch1[i]-'a']++;
			}
		}
		return false;
	}
}
