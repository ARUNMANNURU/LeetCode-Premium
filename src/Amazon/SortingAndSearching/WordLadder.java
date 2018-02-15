/**
 * 
 */
package Amazon.SortingAndSearching;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author ArunMannuru
 *
 */
/*
 * Word Ladder II
Given two words (beginWord and endWord), and a dictionary's word list, find all shortest transformation sequence(s) from beginWord to endWord, such that:

Only one letter can be changed at a time
Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
For example,

Given:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log","cog"]
Return
  [
    ["hit","hot","dot","dog","cog"],
    ["hit","hot","lot","log","cog"]
  ]
 * 
 * 
 */
public class WordLadder {

	/**
	 * @param args
	 */
	class WordNode{
	    String word;
	    int numSteps;
	    WordNode pre;
	 
	    public WordNode(String word, int numSteps, WordNode pre){
	        this.word = word;
	        this.numSteps = numSteps;
	        this.pre = pre;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> result = new ArrayList<List<String>>();
 
        LinkedList<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(start, 1, null));
 
        dict.add(end);
 
        int minStep = 0;
 
        HashSet<String> visited = new HashSet<String>();  
        HashSet<String> unvisited = new HashSet<String>();  
        unvisited.addAll(dict);
 
        int preNumSteps = 0;
 
        while(!queue.isEmpty()){
            WordNode top = queue.remove();
            String word = top.word;
            int currNumSteps = top.numSteps;
 
            if(word.equals(end)){
                if(minStep == 0){
                    minStep = top.numSteps;
                }
 
                if(top.numSteps == minStep && minStep !=0){
                    //nothing
                    ArrayList<String> t = new ArrayList<String>();
                    t.add(top.word);
                    while(top.pre !=null){
                        t.add(0, top.pre.word);
                        top = top.pre;
                    }
                    result.add(t);
                    continue;
                }
 
            }
 
            if(preNumSteps < currNumSteps){
                unvisited.removeAll(visited);
            }
 
            preNumSteps = currNumSteps;
 
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                for(char c='a'; c<='z'; c++){
                    char temp = arr[i];
                    if(arr[i]!=c){
                        arr[i]=c;
                    }
 
                    String newWord = new String(arr);
                    if(unvisited.contains(newWord)){
                        queue.add(new WordNode(newWord, top.numSteps+1, top));
                        visited.add(newWord);
                    }
 
                    arr[i]=temp;
                }
            }
 
 
        }
 
        return result;
    }

}
