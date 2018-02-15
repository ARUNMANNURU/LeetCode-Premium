/**
 * 
 */
package Amazon.TreesAndGraphs;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

/**
 * @author ArunMannuru
 *
 */
/*
 * Binary Tree Vertical Order Traversal
Given a binary tree, return the vertical order traversal of its nodes' values. (ie, from top to bottom, column by column).

If two nodes are in the same row and column, the order should be from left to right.

Examples:

Given binary tree [3,9,20,null,null,15,7],
   3
  /\
 /  \
 9  20
    /\
   /  \
  15   7
return its vertical order traversal as:
[
  [9],
  [3,15],
  [20],
  [7]
]
Given binary tree [3,9,8,4,0,1,7],
     3
    /\
   /  \
   9   8
  /\  /\
 /  \/  \
 4  01   7
return its vertical order traversal as:
[
  [4],
  [9],
  [3,0,1],
  [8],
  [7]
]
Given binary tree [3,9,8,4,0,1,7,null,null,null,2,5] (0's right child is 2 and 1's left child is 5),
     3
    /\
   /  \
   9   8
  /\  /\
 /  \/  \
 4  01   7
    /\
   /  \
   5   2
return its vertical order traversal as:
[
  [4],
  [9,5],
  [3,0,1],
  [8,2],
  [7]
]
 * 
 * 
 * 
 */
public class VerticalOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(root);
	}
	// Utility function to store vertical order in map 'm'
    // 'hd' is horizontal distance of current node from root.
    // 'hd' is initially passed as 0
    static void getVerticalOrder(Node root, int hd,
                                TreeMap<Integer,Vector<Integer>> m)
    {
        // Base case
        if(root == null)
            return;
         
        //get the vector list at 'hd'
        Vector<Integer> get =  m.get(hd);
         
        // Store current node in map 'm'
        if(get == null)
        {
            get = new Vector<>();
            get.add(root.value);
        }
        else
            get.add(root.value);
         
        m.put(hd, get);
         
        // Store nodes in left subtree
        getVerticalOrder(root.left, hd-1, m);
         
        // Store nodes in right subtree
        getVerticalOrder(root.right, hd+1, m);
    }
     
    // The main function to print vertical oder of a binary tree
    // with given root
    static void printVerticalOrder(Node root)
    {
        // Create a map and store vertical oder in map using
        // function getVerticalOrder()
        TreeMap<Integer,Vector<Integer>> m = new TreeMap<>();
        int hd =0;
        getVerticalOrder(root,hd,m);
         
        // Traverse the map and print nodes at every horigontal
        // distance (hd)
        for (Entry<Integer, Vector<Integer>> entry : m.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
}
