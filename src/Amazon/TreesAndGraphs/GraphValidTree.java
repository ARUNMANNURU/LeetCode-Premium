/**
 * 
 */
package Amazon.TreesAndGraphs;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ArunMannuru
 *
 */
/*
 * Graph Valid Tree
Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.

For example:

Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true.

Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.

Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 * 
 * 
 * 
 */
public class GraphValidTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] edges = {{0,1},{0,2},{0,3},{0,4}};
		System.out.println(validTree(n,edges));
	}
	public static boolean validTree(int n, int[][] edges) {
	    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	    for(int i=0; i<n; i++){
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        map.put(i, list);
	    }
	 
	    for(int[] edge: edges){
	        map.get(edge[0]).add(edge[1]);
	        map.get(edge[1]).add(edge[0]);
	    }
	 
	    boolean[] visited = new boolean[n];
	 
	    if(!helper(0, -1, map, visited))
	        return false;
	 
	    for(boolean b: visited){
	        if(!b)
	            return false;
	    }
	 
	    return true;
	}
	 
	public static boolean helper(int curr, int parent, HashMap<Integer, ArrayList<Integer>> map, boolean[] visited){
	    if(visited[curr])
	        return false;
	 
	    visited[curr] = true;
	 
	    for(int i: map.get(curr)){
	        if(i!=parent && !helper(i, curr, map, visited)){
	            return false;
	        }
	    }   
	 
	    return true;
	}

}
