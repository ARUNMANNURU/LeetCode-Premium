/**
 * 
 */
package Amazon.Design;

import java.util.Stack;

/**
 * @author ArunMannuru
 *
 */
/*
 * Serialize and Deserialize BST
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can be serialized to a string and this string can be deserialized to the original tree structure.

The encoded string should be as compact as possible.

Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 * 
 * 
 */
public class SerializeDeserializeBST {
	static TreeNode root;
	static class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int x){
			val = x;
			left = right = null;
		}
	}
	public String serialize(TreeNode root) {
	    if(root==null)
	        return null;
	 
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    stack.push(root);
	    StringBuilder sb = new StringBuilder();
	 
	    while(!stack.isEmpty()){
	        TreeNode h = stack.pop();   
	        if(h!=null){
	            sb.append(h.val+",");
	            stack.push(h.right);
	            stack.push(h.left);  
	        }else{
	            sb.append("#,");
	        }
	    }
	 
	    return sb.toString().substring(0, sb.length()-1);
	}
	 
	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
	    if(data == null)
	        return null;
	 
	    int[] t = {0};
	    String[] arr = data.split(",");
	 
	    return helper(arr, t);
	}
	 
	public TreeNode helper(String[] arr, int[] t){
	    if(arr[t[0]].equals("#")){
	        return null;
	    }
	 
	    TreeNode root = new TreeNode(Integer.parseInt(arr[t[0]]));
	 
	    t[0]=t[0]+1;
	    root.left = helper(arr, t);
	    t[0]=t[0]+1;
	    root.right = helper(arr, t);
	 
	    return root;
	}

}
