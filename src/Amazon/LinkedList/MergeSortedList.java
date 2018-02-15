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
 * Merge k Sorted Lists
 * 
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * 
 */
public class MergeSortedList {

	/**
	 * @param args
	 */
	static Node firstList,secondList;
	static Node first,second;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSortedList mergeList = new MergeSortedList();
		
		mergeList.firstList = new Node(1);
		firstList.next = new Node(2);
		firstList.next.next = new Node(3);
		
		mergeList.secondList = new Node(0);
		secondList.next = new Node(4);
		secondList.next.next = new Node(5);
		
		Node[] arrLists = new Node[]{firstList,secondList};
		Node newNode =	partationList(arrLists,0,arrLists.length-1);
		while(newNode != null){
			System.out.println(newNode.value);
			newNode = newNode.next;
		}
	}
	public static Node partationList(Node[] listArray,int start,int end){
		if(start == end)
			System.out.println(listArray[start]);
		if(start < end){
			int mid = (start+end)/2;
			Node firstList = partationList(listArray,start,mid);
			Node secondList = partationList(listArray,mid+1,end);
			return mergeList(firstList,secondList);
		}else
			return null;		
	}
	public static Node mergeList(Node first,Node second){
		if(first == null) 
            return second;
        if(second == null) 
            return first;
        if(first.value < second.value){
            first.next = mergeList(first.next,second);
            return second;
        }else{
            second.next = mergeList(first,second.next);
            return second;
		}
	}
}
