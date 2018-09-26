/**
 * 
 */
package easy.trees;

/**
 * @author ArunMannuru
 *
 */
/*
 * Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself 
 * (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
   Note:
Bonus points if you could solve it both recursively and iteratively.
 * 
 */
public class IsSymmetric {

	/**
	 * @param args
	 */
	static TreeNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsSymmetric symmetric =  new IsSymmetric();
		symmetric.root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		System.out.println(isSymmetric(root));
	}
	public static boolean isSymmetric(TreeNode root) {
	    return root==null || isSymmetricHelp(root.left, root.right);
	}

	private static boolean isSymmetricHelp(TreeNode left, TreeNode right){
	    if(left==null || right==null)
	        return left==right;
	    if(left.value!=right.value)
	        return false;
	    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
}
