/**
 * 
 */
package medium.others;

import java.util.Stack;

/**
 * @author ArunMannuru
 *
 */
/*
 * Evaluate Reverse Polish Notation

Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

    Division between two integers should truncate toward zero.
    The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.

Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

Example 2:

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

Example 3:

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation: 
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22


 * 
 */
public class ReversePolishNotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"4", "13", "5", "/", "+"};
		System.out.println(evalRPN(tokens));
	}
	public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int temp1, temp2;
        for (String c : tokens){
            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")){
                stack.push(Integer.valueOf(c)); 
            }
            else{
                if (c.equals("+")){
                    temp1 = stack.pop();
                    temp2 = stack.pop();
                    stack.push(temp2 + temp1);
                }
                if (c.equals("-")){
                    temp1 = stack.pop();
                    temp2 = stack.pop();
                    stack.push(temp2 - temp1);
                }
                if (c.equals("*")){
                    temp1 = stack.pop();
                    temp2 = stack.pop();
                    stack.push(temp2 * temp1); 
                }
                if (c.equals("/")){
                    temp1 = stack.pop();
                    temp2 = stack.pop();
                    stack.push(temp2 / temp1); 
                }
            }
            
        }
        return stack.pop();
    }
}
