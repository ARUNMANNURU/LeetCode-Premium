/**
 * 
 */
package medium.btressinorder;

import java.util.ArrayList;

/**
 * @author ArunMannuru
 *
 */
/*
 * Kth Smallest Element in a BST

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3

Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

 * 
 */
public class KthSmallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ArrayList arr=new ArrayList();

    public void printInorder(TreeNode node){
        if (node == null)
            return;
        printInorder(node.left);
        arr.add(node.val);
        printInorder(node.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        printInorder(root);
        return Integer.parseInt(arr.get(k-1).toString());
    }

}
