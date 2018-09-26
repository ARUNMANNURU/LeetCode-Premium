/**
 * 
 */
package easy.linkedlist;

/**
 * @author ArunMannuru
 *
 */
/*
 * Reverse Linked List
 * Reverse a singly linked list.
 * click to show more hints.
 * Hint:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * 
 */
public class ReverseList {

	/**
	 * @param args
	 */
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList revList = new ReverseList();
		Node headNode = new Node(1);
		headNode.next = new Node(2);
		headNode.next.next = new Node(3);
		headNode.next.next.next = new Node(4);
		reverseList(headNode);
	}
	public static void reverseList(Node node){
		Node curr = head, prev = head, temp = null;
		while(head != null){
			temp = curr;
			curr = prev.next;
			prev.next = temp;
			curr = curr.next;
			prev = prev.next;
		}
		while(head != null){
			System.out.println(head.value);
			node = node.next;
		}
	}

}
