/**
 * 
 */
package easy.Strings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 * 
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println(reverseString(str));
	}
	public static String reverseString(String str){
		int start = 0;
		int end = str.length()-1;
		char[] ch = str.toCharArray();
		while(start < end){
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end]   = temp;
			start++;
			end--;
		}
		return String.valueOf(ch);
	}
}
