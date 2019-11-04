package Day20;



	import java.util.Collections;
import java.util.HashMap;
	import java.util.Map;
import java.util.TreeMap;

	public class JavaHashMapTask16 {
	    private static final String reversedmap = null;

		//16. given map, print it like this:
	    // Lemon 200
	    // Apple 100    
	    public static void main(String[] args) {
	    	
	        TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
	        
	        map.put("Apple", 100);
	        map.put("Lemon", 200);
	        
	        for (Map.Entry m : map.entrySet()) {
	            System.out.println(m.getKey() + " " + m.getValue());

	        System.out.println(map);
	        }
	    }
	}
	        
//	       for(String s:map.keySet()) {
//	    	  
//	    	   for(int n:map.values()) {
//	    		   
//	    		   System.out.println(s+n);
//	    	   }
//	        	
//	    	   for (Map.Entry<String, Integer> entry : map.entrySet()){
//	    		   
//	   	        
//	   	        String keys = entry.getKey(); 
//
//	               int values = entry.getValue();
//	               
//	            
//	            	
//	                     
//	             
//	        	
//	        }
//	       
//	    }
//	       }
	    
	

	