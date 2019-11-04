package Day20;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask1 {

	public static void main(String[] args) {
	// 1. Write a Java program to associate the specified value
		
		HashMap<Integer,Integer> map1= new HashMap<>();
		
		map1.put(1,2);
		map1.put(3,4);
		map1.put(5,6);
		
		for(Map.Entry<Integer, Integer> entry : map1.entrySet()) {
			Integer num= entry.getKey();
			Integer num1= entry.getValue();
			System.out.println(num+" " + num1);
			
			
			 HashMap<Integer, String> map = new HashMap<>();
		        map.put(1, "Red");
		        map.put(2, "Green");
		        map.put(3, "Black");
		        map.put(4, "White");
		        map.put(5, "Blue");
		        
		       // /2. Write a Java program to count the number
		        //  of key-value (size) mappings in a map.
		       
		            HashMap<Integer, String> map = new HashMap<>();
		            map.put(1, "Red");
		            map.put(2, "Green");
		            map.put(3, "Black");
		            map.put(4, "White");
		            map.put(5, "Blue");

		            System.out.println("Size of map is: " + map.size());
			
		}

	}

}
