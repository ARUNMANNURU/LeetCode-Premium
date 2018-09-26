/**
 * 
 */
package HashTableProblems;

/**
 * @author ArunMannuru
 *
 */
public class SimpleList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleList list = new SimpleList();
		list.add(10);
		list.add(20);
		list.print();
	}
	static Node head;
	public static void add(int x){
		Node node = new Node(x);
		head = node;
		node.next = head;
	}
	public static void print(){
		if(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}
}
