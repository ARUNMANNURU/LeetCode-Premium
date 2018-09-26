/**
 * 
 */
package medium.linkedlist;

/**
 * @author ArunMannuru
 *
 */
/*
 * Odd Even Linked List
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * Example 1:
 * Input: 1->2->3->4->5->NULL
 * Output: 1->3->5->2->4->NULL
 * Example 2:
 * Input: 2->1->3->5->6->4->7->NULL
 * Output: 2->3->6->7->1->5->4->NULL
 * Note:
    The relative order inside both the even and odd groups should remain as it was in the input.
    The first node is considered odd, the second node even and so on ...
 * 
 * 
 */
public class OddEvenLinkedList {

	/**
	 * @param args
	 */
	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenLinkedList list = new OddEvenLinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
	}
	public static void push(int x){
		Node newNode = new Node(x);
		newNode = head;
		head = newNode;
	}
	public ListNode oddEvenList(ListNode head) {
        if (head != null) {
    
        ListNode odd = head, even = head.next, evenHead = even; 
    
        while (even != null && even.next != null) {
            odd.next = odd.next.next; 
            even.next = even.next.next; 
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead; 
    }
    return head;
    }

}
