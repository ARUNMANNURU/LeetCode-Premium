/**
 * 
 */
package easy.linkedlist;

/**
 * @author ArunMannuru
 *
 */
/*
 * Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 * 
 */
public class PalindromeList {

	/**
	 * @param args
	 */
	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node pali = new Node(1);
		pali.next = new Node(2);
		pali.next.next = new Node(2);
		
		System.out.println(isPalindrome(pali));
	}
	public static boolean isPalindrome(Node head){
		Node slow = head, fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			slow = slow.next;
		}
		slow = reverseList(slow);
		fast = head;
	    
	    while (slow != null) {
	        if (fast.value != slow.value) {
	            return false;
	        }
	        fast = fast.next;
	        slow = slow.next;
	    }
	    return true;
	}
	public static Node reverseList(Node head){
		Node prev = null;
		while(head != null){
			Node next = head.next;
	        head.next = prev;
	        prev = head;
	        head = next;
		}
		return prev;
	}

}
