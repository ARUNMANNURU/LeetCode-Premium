/**
 * 
 */
package Amazon.SortingAndSearching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ArunMannuru
 *
 */
/*
 * Meeting Rooms II
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

For example,
Given [[0, 30],[5, 10],[15, 20]],
return 2.
 * 
 * 
 */
public class MeetingRooms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minMeetingRooms(Interval[] intervals) {
	    if(intervals==null||intervals.length==0)
	        return 0;
	 
	    Arrays.sort(intervals, new Comparator<Interval>(){
	        public int compare(Interval i1, Interval i2){
	            return i1.start-i2.start;
	        }
	    });
	 
	    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	    int count=1;
	    queue.offer(intervals[0].end);
	 
	    for(int i=1; i<intervals.length; i++){
	        if(intervals[i].start<queue.peek()){
	            count++;
	 
	        }else{
	            queue.poll();
	        }
	 
	        queue.offer(intervals[i].end);
	    }
	 
	    return count;
	}

}
