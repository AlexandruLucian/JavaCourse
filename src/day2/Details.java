package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Details {

	public static void main(String[] args) {
		Details object  = new Details();
		System.out.println("String: BeginnersBook.com");
		System.out.println("-------------------------");
		object.countDupChars("BeginnersBook.com");
		
		System.out.println("\nString: ChaitanyaSingh");
		System.out.println("------------------------");
		object.countDupChars("ChaitanyaSingh");
		
		System.out.println("\nString: #@$@!#$%!!%@");
		System.out.println("----------------------");
		object.countDupChars("#@$@!#$%!!%@");
	}

	public void countDupChars(String str) {
		
		//create a HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//convert the string to char array
		char[] chars = str.toCharArray();
		
		/* logic: char are inserted as keys and their count
		 * as values. If map contains the char already then
		 * increase the value by 1
		 */
		for (Character ch :chars) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+ 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		//obtaining set of keys
		Set<Character> keys = map.keySet();
		
		/* Display count of chars if it is
		 * greater than 1. All duplicate chars would be 
		 * having value greater than 1.
		 */
		
		for (Character ch : keys) {
			if(map.get(ch)>1) {
				System.out.println("Char " + ch + " " + map.get(ch));
			}
		}
	}
}
