/**
 * 
 */
package Amazon.Design;

/**
 * @author ArunMannuru
 *
 */



public class Trie {
    private Trie root;
   static class TrieNode {
        Trie[] arr;
        boolean isEnd;
        // Initialize your data structure here.
        public TrieNode() {
            this.arr = new Trie[26];
        }
     
    } 
    public Trie() {
        root = new Trie();
    }
     
 
    // Inserts a word into the trie.
    public void insert(String word) {
        Trie p = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.arr[index]==null){
                Trie temp = new Trie();
                p.arr[index]=temp;
                p = temp;
            }else{
                p=p.arr[index];
            }
        }
        p.isEnd=true;
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) {
        Trie p = searchNode(word);
        if(p==null){
            return false;
        }else{
            if(p.isEnd)
                return true;
        }
 
        return false;
    }
 
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        Trie p = searchNode(prefix);
        if(p==null){
            return false;
        }else{
            return true;
        }
    }
 
    public Trie searchNode(String s){
        Trie p = root;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int index = c-'a';
            if(p.arr[index]!=null){
                p = p.arr[index];
            }else{
                return null;
            }
        }
 
        if(p==root)
            return null;
 
        return p;
    }
}
