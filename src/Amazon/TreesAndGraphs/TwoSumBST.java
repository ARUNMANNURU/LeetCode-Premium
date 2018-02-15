/**
 * 
 */
package Amazon.TreesAndGraphs;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author ArunMannuru
 *
 */
/*
 * Two Sum IV - Input is a BST
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
 * 
 */
public class TwoSumBST {

	/**
	 * @param args
	 */
	static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumBST simpleTree = new TwoSumBST();
		
		simpleTree.root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(0);
		root.left.right = new Node(4);
		System.out.println(findTarget(root,4));
	}
	public static boolean findTarget(Node root, int k) {
        Set<Integer> candidates = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            if (root != null) {
                int val = root.value;
                if (candidates.contains(val)) {
                    return true;
                } else {
                    candidates.add(k - val);
                }
                stack.add(root);
                root = root.left;
            } else {
                Node node = stack.pop();
                root = node.right;
            }
        }
        return false;
    }

}
