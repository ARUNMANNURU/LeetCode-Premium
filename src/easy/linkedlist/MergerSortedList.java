/**
 * 
 */
package easy.linkedlist;

/**
 * @author ArunMannuru
 *
 */
/*
 * Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * 
 */
public class MergerSortedList {

	/**
	 * @param args
	 */
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node listOne = new Node(1);
		listOne.next = new Node(2);
		listOne.next.next = new Node(3);
		
		Node listTwo = new Node(1);
		listTwo.next = new Node(2);
		listTwo.next.next = new Node(4);
		
		Node newlist = mergeList(listOne,listTwo);
		while(newlist != null){
			System.out.println(newlist.value);
			newlist = newlist.next;
		}
	}
	public static Node mergeList(Node listOne,Node listTwo){
		
		Node mergedList = null;
		if(listOne == null)
			return mergedList = listTwo;
		if(listTwo == null)
			return mergedList = listOne;
		if(listOne.value < listTwo.value){
	        listOne.next = mergeList(listOne.next, listTwo);
	        return listOne;
	    }else{
	        listTwo.next = mergeList(listOne,listTwo.next);
	        return listTwo;
	    }
	}

}
