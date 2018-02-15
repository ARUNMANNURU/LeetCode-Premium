/**
 * 
 */
package Amazon.TreesAndGraphs;

/**
 * @author ArunMannuru
 *
 */
/*
 * Subtree of Another Tree
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
 * 
 * 
 * 
 */
public class SubTreeOfAnother {

	/**
	 * @param args
	 */
	static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubTreeOfAnother simpleTree = new SubTreeOfAnother();
		
		simpleTree.root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(0);
		root.left.right = new Node(4);
		System.out.println(isSubtree(root,root.left));
	}
	public static boolean isSubtree(Node s, Node t) {
        if (s == null) return false;
        if (isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private static boolean isSame(Node s, Node t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.value != t.value) return false;
        
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }

}
