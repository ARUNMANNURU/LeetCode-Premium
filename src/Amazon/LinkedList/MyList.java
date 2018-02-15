/**
 * 
 */
package Amazon.LinkedList;

/**
 * @author ArunMannuru
 *
 */
public class MyList {

	/**
	 * @param args
	 */
	
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyList myList = new MyList();
		
		head = new Node(3);
		head.next = new Node(2);
		head.next.next = new Node(1);
		
		myList.printList();
		
		myList.addValue(5);
		
	}
	public static void addValue(int x){
		Node n = head;
		if(n == null)
			n.next = new Node(x);
			n = n.next;
	}
	public static void printList(){
		Node n = head;
		while(n != null){
			System.out.println(n.value);
			n = n.next;
		}
	}
	static class Node{
		Node next;
		int value;
		Node(int value){
			this.value = value;
			next = null;
		}
	}
}
