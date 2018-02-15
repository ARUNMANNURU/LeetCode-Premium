/**
 * 
 */
package Amazon.TreesAndGraphs;

/**
 * @author ArunMannuru
 *
 */
/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

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
 * 
 * 
 */
public class Symmetric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Symmetric tree = new Symmetric();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean output = tree.isSymmetric(tree.root);
        if (output == true)
            System.out.println("1");
        else
            System.out.println("0");
	}
	Node root;
	  
    // returns true if trees with roots as root1 and root2 are mirror
    boolean isMirror(Node node1, Node node2) 
    {
        // if both trees are empty, then they are mirror image
        if (node1 == null && node2 == null)
            return true;
  
        // For two trees to be mirror images, the following three
        // conditions must be true
        // 1 - Their root node's key must be same
        // 2 - left subtree of left tree and right subtree
        //      of right tree have to be mirror images
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images
        if (node1 != null && node2 != null && node1.value == node2.value)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));
  
        // if neither of the above conditions is true then
        // root1 and root2 are mirror images
        return false;
    }
  
    // returns true if the tree is symmetric i.e
    // mirror image of itself
    boolean isSymmetric(Node node) 
    {
        // check if tree is mirror of itself
        return isMirror(root, root);
    }
  

}
