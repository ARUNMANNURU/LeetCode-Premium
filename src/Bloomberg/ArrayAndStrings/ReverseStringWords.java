/**
 * 
 */
package Bloomberg.ArrayAndStrings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Reverse Words in a String II

Given an input string , reverse the string word by word. 

Example:

Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]

Note: 

    A word is defined as a sequence of non-space characters.
    The input string does not contain leading or trailing spaces.
    The words are always separated by a single space.

Follow up: Could you do it in-place without allocating extra space?

 */
public class ReverseStringWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		reverseWords(str);
	}
	public static void reverseWords(char[] s) {
        int i=0;
        for(int j=0; j<s.length; j++){
            if(s[j]==' '){
                reverse(s, i, j-1);        
                i=j+1;
            }
        }
        reverse(s, i, s.length-1);
        reverse(s, 0, s.length-1);
        for(char c : s){
        	System.out.print(c+" ");
        }
	}
 
	public static void reverse(char[] s, int i, int j){
		while(i<j){
			char temp = s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
	}

}
