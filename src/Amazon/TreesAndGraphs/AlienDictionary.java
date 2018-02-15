/**
 * 
 */
package Amazon.TreesAndGraphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * @author ArunMannuru
 *
 */
/*
 * Alien Dictionary
There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. You receive a list of non-empty words from the dictionary, where words are sorted lexicographically by the rules of this new language. Derive the order of letters in this language.

Example 1:
Given the following words in dictionary,

[
  "wrt",
  "wrf",
  "er",
  "ett",
  "rftt"
]
The correct order is: "wertf".

Example 2:
Given the following words in dictionary,

[
  "z",
  "x"
]
The correct order is: "zx".

Example 3:
Given the following words in dictionary,

[
  "z",
  "x",
  "z"
]
The order is invalid, so return "".

Note:
You may assume all letters are in lowercase.
You may assume that if a is a prefix of b, then a must appear before b in the given dictionary.
If the order is invalid, return an empty string.
There may be multiple valid order of letters, return any one of them is fine.
 * 
 * 
 */
public class AlienDictionary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"wrt","wrf","er","ett","rftt"};
		System.out.println(alienOrder(words));
			
	}
	 public static String alienOrder(String[] words) {
		          if(words == null || words.length == 0){
		              return "";
		          }
		          
		          Set<Character> uniqueChar = new HashSet<Character>();
		          for(String word : words){
		             for(int i = 0; i<word.length(); i++){
		                 uniqueChar.add(word.charAt(i));
		             }
		         }
		        
		        int [] inDegree = new int[26];
		         Map<Character, Set<Character>> graph = new HashMap<Character, Set<Character>>();
		         for(int i = 1; i<words.length; i++){
		             String pre = words[i-1];
		             String cur = words[i];
		             for(int k = 0; k<Math.min(pre.length(), cur.length()); k++){
		                 if(pre.charAt(k) != cur.charAt(k)){
		                     char source = pre.charAt(k);
		                     char dest = cur.charAt(k);
		                     if(!graph.containsKey(source)){
		                         graph.put(source, new HashSet<Character>());
		                     }
		                     if(!graph.get(source).contains(dest)){
		                         inDegree[dest-'a']++;
		                     }
		                     graph.get(source).add(dest);
		                     break;
		                 }
		             }
		         }
		         
		         StringBuilder sb = new StringBuilder();
		         LinkedList<Character> que = new LinkedList<Character>();
		         for(int i = 0; i<26; i++){
		             char c = (char)(i+'a');
		             if(inDegree[i] == 0 && uniqueChar.contains(c)){
		                 que.add((c));
		             }
		         }
		         
		         while(!que.isEmpty()){
		             char source = que.poll();
		             sb.append(source);
		             if(graph.containsKey(source)){ 
		                 for(char dest : graph.get(source)){
		                     inDegree[dest-'a']--;
		                     if(inDegree[dest-'a'] == 0){
		                         que.add(dest);
		                     }
		                 }
		             }
		             
		         }
		         return sb.length() == uniqueChar.size() ? sb.toString() : "";
		     }

}
