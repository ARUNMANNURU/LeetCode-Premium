/**
 * 
 */
package medium.btressinorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ArunMannuru
 *
 */
/*
 * Binary Tree Inorder Traversal
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * Example:
 * Input: [1,null,2,3]
 * 1
    \
     2
    /
   3
  Output: [1,3,2]
  Follow up: Recursive solution is trivial, could you do it iteratively?

 * 
 */
public class BinaryTreeInorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
        cur = stack.pop();
        list.add(cur.val);
        cur = cur.right;
    }

    return list;
    } 
}
