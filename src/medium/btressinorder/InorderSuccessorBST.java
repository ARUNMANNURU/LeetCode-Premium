/**
 * 
 */
package medium.btressinorder;

/**
 * @author ArunMannuru
 *
 */
/*
 * Inorder Successor in BST

Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null.

Example 1:

Input: root = [2,1,3], p = 1

  2
 / \
1   3

Output: 2

Example 2:

Input: root = [5,3,6,2,4,null,null,1], p = 6

      5
     / \
    3   6
   / \
  2   4
 /   
1

Output: null


 */
public class InorderSuccessorBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private boolean flag;
	private TreeNode target;
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
	    find(root, p);
		return target;
	}

	private void find(TreeNode root, TreeNode p) {
		if (root == null)
			return;
	    find(root.left, p);
	    if (this.flag) {
	        target = root;
	        flag = false;
	    }
		if (p == root) {
			this.flag = true;
		}

		find(root.right, p);
	}

}
