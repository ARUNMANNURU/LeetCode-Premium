/**
 * 
 */
package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ArunMannuru
 *
 */
public class Movie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOne = new ArrayList<String>();
		listOne.add("Arun");
		listOne.add("Varun");
		listOne.add("Simpu");
		List<String> listTwo = new ArrayList<String>();
		listTwo.add("Arun");
		listTwo.add("Varun");
		List<String> arrList = new ArrayList<String>();
		arrList = movieMatch(listOne,listTwo);
		for(String list : arrList){
			System.out.println(list);
		}
	}
	// Order O(m+n)
	public static List<String> movieMatch(List<String> one,List<String> two){
		
		HashMap<String,Boolean> hMap = new HashMap<String,Boolean>();
		List<String> result = new ArrayList<String>();
		boolean count = false;
		for(String listOne: one){
			hMap.put(listOne, true);
		}
		for(String listTwo : two){
			if(hMap.containsKey(listTwo)){
				result.add(listTwo);
			}
		}
		return result;
	}
}
