/**
 * 
 */
package easy.linkedlist;

/**
 * @author ArunMannuru
 *
 */
/*
 * Delete Node in a Linked List
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value
 *  3, the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 */

class Node{
	int value;
	Node next;
	Node(int x){
		value = x;
		next = null;
	}
}
public class DeleteNode {

	/**
	 * @param args
	 */
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNode delNode = new DeleteNode();
		delNode.head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		int x = 3;
		Node nodAfter = deleteNode(head,x);
		while(nodAfter != null){
			System.out.println(nodAfter.value);
			nodAfter = nodAfter.next;
		}
	}
	public static Node deleteNode(Node node,int x){
		// Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.value == x)
        {
            head = temp.next; // Changed head
            return head;
        }
 
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.value != x)
        {
            prev = temp;
            temp = temp.next;
        }    
 
        // If key was not present in linked list
        if (temp == null) 
        	return temp;
 
        return prev.next = temp.next;
	}
}
