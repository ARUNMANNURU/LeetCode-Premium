/**
 * 
 */
package easy.linkedlist;

/**
 * @author ArunMannuru
 *
 */
/* Linked List Cycle
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 */
public class ListCycle {

	/**
	 * @param args
	 */
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node listNode = new Node(1);
		listNode.next = new Node(2);
		listNode.next.next = new Node(3);
		listNode.next.next.next = new Node(2);
		listCycle(listNode);
	}
	public static void listCycle(Node listNode){
		Node slow = head, fast = head;
		if(listNode != null && listNode.next != null){
			while(listNode != null){
				if(slow.value == fast.value)
					System.out.println("Yes");
				else{
					System.out.println("NO");
				}
				slow = slow.next;
				fast = fast.next.next;
			}
		}
	}
}
