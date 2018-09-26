/**
 * 
 */
package easy.trees;

/**
 * @author ArunMannuru
 *
 */
/*
 * Validate Binary Search Tree
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
    2
   / \
  1   3
  Binary tree [2,1,3], return true.
  Example 2:
    1
   / \
  2   3
  Binary tree [1,2,3], return false. 
 * 
 */
public class ValidateBTree {

	/**
	 * @param args
	 */
	static TreeNode root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateBTree validTree = new ValidateBTree();
		validTree.root = new TreeNode(2);
		root.left = new TreeNode(10);
		root.right = new TreeNode(3);
		System.out.println(isValid(root));
	}
	public static boolean isValid(TreeNode root){
		
		if(root == null)
			return true;
		if(root != null){
			return (root.left.value < root.value) && (root.right.value > root.value);
		}
		return false;
	}
}
