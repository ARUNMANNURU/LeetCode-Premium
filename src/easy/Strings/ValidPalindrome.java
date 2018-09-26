/**
 * 
 */
package easy.Strings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Valid Palindrome
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * Note:
 * Have you consider that the string might be empty? 
 * This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * 
 */
public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String str){
		// Check if string is empty
		if(str.isEmpty())
			return true;
		// to reverse string check start as head and end as tail of string 
		int head = 0, tail = str.length()-1;
		// keep checking the characters from starting to ending
		char cHead, cTail;
		while(head <= tail){
			cHead = str.charAt(head);
			cTail = str.charAt(tail);
			if(!Character.isLetterOrDigit(cHead)){
				head++;
			}
			else if(!Character.isLetterOrDigit(cTail)){
				tail--;
			}else{
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
						return false;
	        		}
	        		head++;
	        		tail--;
			}
		}
		return true;
	}
}
