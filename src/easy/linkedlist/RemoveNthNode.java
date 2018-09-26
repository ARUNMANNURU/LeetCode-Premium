/**
 * 
 */
package easy.linkedlist;

/**
 * @author ArunMannuru
 *
 */
/*
 * Remove Nth Node From End of List
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */
public class RemoveNthNode {

	/**
	 * @param args
	 */
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNthNode remNode = new RemoveNthNode();
		remNode.head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		int x = 2;
		removeNthNode(head,x);
	}
	public static void removeNthNode(Node node,int x){
		Node prev = null,curr = null;
		while(node != null){
			for(int i = 0; i < x; i++){
				prev = prev.next;
			}
		}
		while(node != null){
			if(prev == null){
				curr.next = curr.next.next;
			}
			prev = prev.next;
			curr = curr.next;
		}
		while(node != null){
			System.out.println(node.value);
			node = node.next;
		}
	}

}
