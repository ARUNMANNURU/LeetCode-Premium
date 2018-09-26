/**
 * 
 */
package HashTableProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ArunMannuru
 *
 */
public class MyHashSet {
    
	private static final int MAX_LEN = 100000; // the amount of buckets
    private static List<Integer>[] set;      // hash set implemented by array
    
    public static void main(String args[]){
    	MyHashSet hSet = new MyHashSet();
    	hSet.add(3);
    	hSet.add(4);
    	System.out.println(hSet.getIndex(4));
    	
    }
    
    /** Returns the corresponding bucket index. */
    private static int getIndex(int key) {
        return key % MAX_LEN;
    }
    
    /** Search the key in a specific bucket. Returns -1 if the key does not existed. */
    private static int getPos(int key, int index) {
        // Each bucket contains a list.
        List<Integer> temp = set[index];
        if (temp == null) {
            return -1;
        }
        // Iterate all the elements in the bucket to find the target key.
        for (int i = 0; i < temp.size(); ++i) {
            if (temp.get(i) == key) {
                return i;
            }
        }
        return -1;
    }
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        set = (List<Integer>[])new ArrayList[MAX_LEN];
    }
    
    public static void add(int key) {
        int index = getIndex(key);
        int pos = getPos(key, index);
        if (pos < 0) {
            // Add new key if key does not exist.
            if (set[index] == null) {
                set[index] = new ArrayList<Integer>();
            }
            set[index].add(key);
        }
    }
    
    public static  void remove(int key) {
        int index = getIndex(key);
        int pos = getPos(key, index);
        if (pos >= 0) {
            // Remove the key if key exists.
            set[index].remove(pos);
        }
    }
    
    /** Returns true if this set did not already contain the specified element */
    public static boolean contains(int key) {
        int index = getIndex(key);
        int pos = getPos(key, index);
        return pos >= 0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */