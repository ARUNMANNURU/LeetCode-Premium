/**
 * 
 */
package Amazon.TreesAndGraphs;

/**
 * @author ArunMannuru
 *
 */
public class SimpleBinaryTree {

	/**
	 * @param args
	 */
	static Node left,right;
	static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleBinaryTree simpleTree = new SimpleBinaryTree();
		
		simpleTree.root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		simpleTree.binaryTree();
	}
	public static void binaryTree(){
		if(root == null)
			System.out.println("Not a binary search tree");
		if(root != null){
			if(root.left != null || root.left.value > root.value){
				System.out.println("Not B-Tree");
			}
			if(root.right != null || root.right.value < root.value){
				System.out.println("Not B-Tree");
			}
			System.out.println("Yes");
		}
		
	}

}
