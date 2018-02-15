/**
 * 
 */
package Amazon.TreesAndGraphs;

/**
 * @author ArunMannuru
 *
 */
/*
 * Sum Root to Leaf Numbers
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
 * 
 * 
 * 
 */
public class SumToLeaf {

	/**
	 * @param args
	 */
	static Node right,left,root; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumToLeaf sumLeaf = new SumToLeaf();
		sumLeaf.root = new Node(1);
		left = new Node(2);
		right = new Node(3);
		
		System.out.println(sumNumbers(sumLeaf.root));
		
	}
	public static int sumNumbers(Node root) {
	    if(root == null) 
	        return 0;
	 
	    return dfs(root, 0, 0);
	}
	 
	public static int dfs(Node node, int num, int sum){
	    if(node == null) return sum;
	 
	    num = num*10 + node.value;
	 
	    // leaf
	    if(node.left == null && node.right == null) {
	        sum += num;
	        return sum;
	    }
	 
	    // left subtree + right subtree
	    sum = dfs(node.left, num, sum) + dfs(node.right, num, sum);
	    return sum;
	}
}
