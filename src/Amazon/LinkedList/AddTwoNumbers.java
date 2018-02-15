/**
 * 
 */
package Amazon.LinkedList;

import Amazon.LinkedList.MyList.Node;

/**
 * @author ArunMannuru
 *
 */
public class AddTwoNumbers {

	/**
	 * @param args
	 */
	
	static Node firstList,secondList;
	static Node resultList;
	static Node newNode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddTwoNumbers addNum = new AddTwoNumbers();
		
		addNum.firstList = new Node(1);
		firstList.next = new Node(2);
		firstList.next.next = new Node(3);
		
		addNum.secondList = new Node(3);
		addNum.secondList.next = new Node(4);
		addNum.secondList.next.next = new Node(5);
		
		addNum.addTwoNumbers(firstList, secondList);
		addNum.printList();
		
		
    }
	public static void addTwoNumbers(Node firstList,Node secondList){
		
		Node one = firstList;
		Node two = secondList;
		newNode = new Node(0);
		Node resultList = newNode;
		int sum = 0;
		while(one != null || two != null){
			sum /= 10;
			if(one != null){
				sum += one.value;
				one = one.next;
			}
			if(two != null){
				sum += two.value;
				two = two.next;
			}
			resultList.next = new Node(sum%10);
			resultList = resultList.next;
		}
		 if (sum / 10 == 1)
			 resultList.next = new Node(1);
		 	 resultList = resultList.next;
	  
	}
	public static void printList(){
		
		Node head = newNode;
		
		while(head != null){
			System.out.print(head.value);
			head = head.next;
		}
		
	}
}
