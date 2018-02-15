/**
 * 
 */
package Amazon;

/**
 * @author ArunMannuru
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
		char[] ch = str.toCharArray();
		int len = str.length();
		for(int i=0; i < len/2; i++){
			char temp = ch[i];
			ch[i] = ch[len-i-1];
			ch[len-i-1] = temp;
		}
		return String.valueOf(ch);
	}
}
