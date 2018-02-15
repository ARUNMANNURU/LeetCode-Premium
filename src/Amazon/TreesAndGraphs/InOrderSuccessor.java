/**
 * 
 */
package Amazon.TreesAndGraphs;

import java.util.Stack;

/**
 * @author ArunMannuru
 *
 */
/*
 * Inorder Successor in BST
Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null.
 * 
 * 
 */
public class InOrderSuccessor {

	/**
	 * @param args
	 */
	static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InOrderSuccessor simpleTree = new InOrderSuccessor();
		
		simpleTree.root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(0);
		root.left.right = new Node(4);
		System.out.println(inorderSuccessor(root,root.left));
	}
	
	public static Node inorderSuccessor(Node root, Node p) {
	    if(root==null)
	        return null;
	 
	    Node next = null;
	    Node c = root;
	    while(c!=null && c.value !=p.value){
	        if(c.value > p.value){
	            next = c;
	            c = c.left;
	        }else{
	            c= c.right;
	        }
	    }
	 
	    if(c==null)        
	        return null;
	 
	    if(c.right==null)
	        return next;
	 
	    c = c.right;
	    while(c.left!=null)
	        c = c.left;
	 
	    return c;
	}

}
