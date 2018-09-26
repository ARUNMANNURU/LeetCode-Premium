/**
 * 
 */
package easy.Strings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Implement strStr()
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 
 * if needle is not part of haystack.
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 */
public class ImplementstrStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hayStack = "hello";
		String needle = "ll";
		System.out.println(stringOfString(hayStack,needle));
	}
	public static int stringOfString(String hayStack,String needle){
		int lenStack = hayStack.length();
		int lenNeedle = needle.length();
		if(lenStack < lenNeedle){
			return -1;
		}else {	
			if(lenStack == 0){
				return 0;
			}
		int diff = lenStack - lenNeedle;
		for(int i = 0; i < diff; i++){
			if(hayStack.substring(i, i+lenNeedle).equals(needle))
				return i;
		}
		return -1;
		}
	}
}
