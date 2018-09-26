/**
 * 
 */
package HashTableProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author ArunMannuru
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] scores = {{"arun","100"},{"simpu","20"},{"varun","100"},{"varun","200"},{"varun","40"}};
		System.out.println(averageScores(scores));
	}
	public static Integer averageScores(String[][] scores){
		HashMap<String,Integer> hMap = new HashMap<String,Integer>();//O(n)
		int average = 0;
		int sum = 0;
		int count = 1;
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[0].length; j++){
				if(scores[i][0].equals(scores[1][j])){
					++count;
					sum += Integer.parseInt(scores[1][j]);
					average = sum/count;
					System.out.println("Arun");
					hMap.put(scores[i][0],average);
				}else{
					hMap.put(scores[i][0], Integer.parseInt(scores[1][j]));
				}
			}
		}
		//O(n)
		int highest = 0;
		for(Map.Entry<String, Integer> result : hMap.entrySet()){
			if(result.getValue() > highest){
				highest = result.getValue();
			}
		}
		return highest;
	}
}
