/**
 * 
 */
package easy.trees;

/**
 * @author ArunMannuru
 *
 */
/*Binary Tree Level Order Traversal
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
   return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 * 
 * 
 */
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	static TreeNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal levelOrder = new LevelOrderTraversal();
		levelOrder.root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
	}
	public static TreeNode levelOrder(TreeNode root){
		if(root == null)
			return null;
		if(root.left != null)
			return levelOrder(root.left);
		if(root.right != null)
			return levelOrder(root.right);
		return root;
	}

}
