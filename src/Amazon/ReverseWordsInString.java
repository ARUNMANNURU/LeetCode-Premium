/**
 * 
 */
package Amazon;

import java.util.Stack;

/**
 * @author ArunMannuru
 *
 */
/*
 * Reverse Words in a String II
 * Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
 * The input string does not contain leading or trailing spaces and the words are always separated by a single space.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * Could you do it in-place without allocating extra space?
 *
 */
public class ReverseWordsInString {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "hello how are you";
//		String words[] = str.split(" ");
//		String temp = null;
//		int lenWords =  words.length;
//		int start = 0;
//		int end = lenWords-1;
//		while(start < end){
//			temp = words[start];
//			words[start] = words[end];
//			words[end] = temp;
//			start++;
//			end--;
//		}
//		for(String x : words){
//			System.out.print(x+" ");
//		}
//	}
	public static void main(String[] args){
		String str = "hello how are you";
		Stack stack = new Stack();
		String[] charArr = str.split(" ");
		int start = 0;
		String finalString = "";
		for(String ch : charArr){
			stack.push(ch);
		}
		while(stack.size() > 0){
			finalString += " "+stack.pop();
		}
		System.out.println(finalString);
	}
}
