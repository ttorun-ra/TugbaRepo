package Day20;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashMapTask9 {

	public static void main(String[] args) {
		//10. Write a Java program to get the
	    //          value of a specified key in a map.

		HashMap<Integer,String> map= new HashMap<>();
		
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");

		System.out.println("At key 1 we have " + map.get(1));
		
		//11. Write a Java program to get a set view of the keys contained in this map.
		
		System.out.println(map.keySet());
		
		  HashMap<Character, Boolean> map1 = new HashMap<>();
	        map1.put('A', true);
	        map1.put('B', true);
	        map1.put('C', false);

	        //print => A B C
	        Set<Character> characters = map1.keySet();
	        System.out.println(characters);

	        for (Character character : characters) {
	            System.out.println(character);
	        }

	        //
	        for (Entry<Character, Boolean> entry : map1.entrySet()) {
	            Character key = entry.getKey();

	            System.out.println("key is " + key);

	}

}
}
