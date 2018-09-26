/**
 * 
 */
package easy.trees;

/**
 * @author ArunMannuru
 *
 */
/*
 * Convert Sorted Array to Binary Search Tree
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Example:
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
      0
     / \
   -3   9
   /   /
 -10  5
 * 
 * 
 */
public class SortedArrayToBST {

	/**
	 * @param args
	 */
	static TreeNode root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-10,-3,0,5,9};
		int start = 0, end = arr.length;
		binarySearch(arr,start,end);
	}
	public static TreeNode binarySearch(int[] arr,int start,int end){
		int mid = (start+end)/2;
		if(start > end)
			return null;
		if(start == end)
			return new TreeNode(arr[start]);
		root = new TreeNode(arr[mid]);
		root.left = binarySearch(arr,start,mid-1);
		root.right = binarySearch(arr,mid+1,end);
		return root;
	}
}
