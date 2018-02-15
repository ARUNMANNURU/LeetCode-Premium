/**
 * 
 */
package Amazon.TreesAndGraphs;

/**
 * @author ArunMannuru
 *
 */
/*
 * Closest Binary Search Tree Value
Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

Note:
Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.
 * 
 * 
 */

public class ClosestBinarySearchTree {

	/**
	 * @param args
	 */
	static double goal;
    static double min = Double.MAX_VALUE;
 
	static Node right,left,root;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClosestBinarySearchTree closeSearch = new ClosestBinarySearchTree();
		
		closeSearch.root = new Node(10.987);
		root.left = new Node(4.234);
		root.left.left = new Node(2.098);
		root.right = new Node(11.098);
		root.right.right = new Node(13.98);
		
		System.out.println(closestValue(root,5.98));
		
	}
	
    public static double closestValue(Node root, double target) {
        helper(root, target);
        return goal;
    }
 
    public static void helper(Node root, double target){
        if(root==null)
            return;
 
        if(Math.abs(root.value - target) < min){
            min = Math.abs(root.value-target);
            goal = root.value;
        } 
 
        if(target < root.value){
            helper(root.left, target);
        }else{
            helper(root.right, target);
        }
    }
    static class Node{
    	double value;
    	Node left,right;
    	Node(double x){
    		left = right = null;
    		value = x;
    	}
    }

}
