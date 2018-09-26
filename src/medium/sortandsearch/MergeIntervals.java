/**
 * 
 */
package medium.sortandsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ArunMannuru
 *
 */
/*
 * Merge Intervals

Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.


 * 
 */
public class MergeIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
 
    if(intervals==null||intervals.size()==0)
        return result;
 
    Collections.sort(intervals, new Comparator<Interval>(){
        public int compare(Interval i1, Interval i2){
            if(i1.start!=i2.start)
                return i1.start-i2.start;
            else
                return i1.end-i2.end;
        }
    });
 
    Interval pre = intervals.get(0);
    for(int i=0; i<intervals.size(); i++){
        Interval curr = intervals.get(i);
        if(curr.start>pre.end){
            result.add(pre);
            pre = curr;
        }else{
            Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
            pre = merged;
        }
    }
    result.add(pre);
 
    return result;
    }
	class Interval {
	      int start;
	      int end;
		      Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
	}

}
