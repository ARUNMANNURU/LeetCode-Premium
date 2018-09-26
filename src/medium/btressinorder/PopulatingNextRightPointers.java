/**
 * 
 */
package medium.btressinorder;

/**
 * @author ArunMannuru
 *
 */
/*
 * Populating Next Right Pointers in Each Node

Given a binary tree

struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

    You may only use constant extra space.
    Recursive approach is fine, implicit stack space does not count as extra space for this problem.
    You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).

Example:

Given the following perfect binary tree,

     1
   /  \
  2    3
 / \  / \
4  5  6  7

After calling your function, the tree should look like:

     1 -> NULL
   /  \
  2 -> 3 -> NULL
 / \  / \
4->5->6->7 -> NULL


 * 
 */
public class PopulatingNextRightPointers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void connect(TreeLinkNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        populate(root);
        
    }
    
    void populate(TreeLinkNode root){
        if(root == null){
            return;
        }
        
        if(root.left != null){
            root.left.next = root.right;
            if(root.next != null){
                root.right.next = root.next.left;    
            }
            populate(root.left);
            populate(root.right);
        }
    }

}
