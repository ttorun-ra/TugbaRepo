package Day20;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask15 {

	public static void main(String[] args) {
		 //15. given map, print it like this:
	    // Apple 100
	    // Lemon 200
	    // Peach 150
	    // Melon 145
	    // Berry 250
	  
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("Apple", 100);
	        map.put("Lemon", 200);
	        map.put("Peach", 150);
	        map.put("Melon", 145);
	        map.put("Berry", 250);
	        
	        
	        for (Map.Entry<String, Integer> entry : map.entrySet()){
 
	        
	        String keys = entry.getKey(); 

            int values = entry.getValue();

            System.out.println(keys + " " + values);
	        }  
	        
	        
	    }

	        }
	

	
