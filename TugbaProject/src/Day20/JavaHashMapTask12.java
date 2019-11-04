package Day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMapTask12 {

	public static void main(String[] args) {
		 HashMap<Integer, String> map = new HashMap<>();
	        map.put(1, "Red");
	        map.put(2, "Green");
	        map.put(3, "Black");
	        map.put(4, "White");
	        map.put(5, "Blue");
	        
	        System.out.println(map.values());
	        
	       for(Map.Entry<Integer, String> entry: map.entrySet()) {
	    	   String value = entry.getValue();

	            System.out.println("value is " + value);

	       }
	        }


	}

