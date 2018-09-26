/**
 * 
 */
package easy.trees;

/**
 * @author ArunMannuru
 *
 */
/*
 * Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 * 
 */
class TreeNode{
	
	int value;
	TreeNode left,right;
	TreeNode(int x){
		value = x;
		left = right = null;
	}
}
public class MaximumDepthOfBTree {

	/**
	 * @param args
	 */
	static TreeNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaximumDepthOfBTree maxD = new MaximumDepthOfBTree();
		maxD.root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(maxDepth(root));
	}
	public static int maxDepth(TreeNode root){
		if(root == null)
			return 0;
		int left = 1+maxDepth(root.left);
		int	right = 1+maxDepth(root.right);
		return Math.max(left,right);
	}
}
