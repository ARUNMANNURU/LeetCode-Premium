/**
 * 
 */
package Amazon.TreesAndGraphs;

/**
 * @author ArunMannuru
 *
 */
/*
 * Validate Binary Search Tree
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:
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
 * 
 * 
 */
public class ValidateBST {

	/**
	 * @param args
	 */
	// Root of the Binary Tree
    Node root;
 
    // To keep tract of previous node in Inorder Traversal
    Node prev;
 
    boolean isBST()  {
        prev = null;
        return isBST(root);
    }
 
    /* Returns true if given search tree is binary
       search tree (efficient version) */
    boolean isBST(Node node)
    {
        // traverse the tree in inorder fashion and
        // keep a track of previous node
        if (node != null)
        {
            if (!isBST(node.left))
                return false;
 
            // allows only distinct values node
            if (prev != null && node.value <= prev.value )
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateBST tree = new ValidateBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
	}

}
