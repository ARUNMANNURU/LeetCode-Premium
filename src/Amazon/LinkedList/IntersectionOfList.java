/**
 * 
 */
package Amazon.LinkedList;

import Amazon.LinkedList.MyList.Node;

/**
 * @author ArunMannuru
 *
 */
/*
 * Intersection of Two Linked Lists
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 * A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.
Notes:
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 * 
 * 
 * 
 */
public class IntersectionOfList {

	/**
	 * @param args
	 */
	static Node firstList,secondList;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfList listIntersection = new IntersectionOfList();
		
		listIntersection.firstList = new Node(1);
		firstList.next = new Node(2);
		firstList.next.next = new Node(5);
		firstList.next.next.next = new Node(8);
		firstList.next.next.next.next = new Node(9);
		
		
		listIntersection.secondList = new Node(3);
		secondList.next = new Node(4);
		secondList.next.next = new Node(5);
		secondList.next.next.next = new Node(6);
		secondList.next.next.next.next = new Node(7);
		secondList.next.next.next.next.next = new Node(67);
		
		System.out.println(listIntersection.intersectList(firstList, secondList));
		
	}
	public static Node intersectList(Node firstList,Node secondList){
		Node first = firstList;
		Node second = secondList;
		int lenA = lengthList(first);
		int lenB = lengthList(second);
		if(first == null || second == null)
			return null;
		while(lenA > lenB){
			first = first.next;
			lenA--;
		}
		while(lenA < lenB){
			second = second.next;
			lenB--;
		}
		while(first != second){
			first = first.next;
			second = second.next;
		}
		return first;
	}
	public static int lengthList(Node list){
		
		Node n = list;
		int length = 0;
		while(n != null){
			++length;
			n = n.next;
		}
		return length;
	}

}
