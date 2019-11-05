package Day20;

import java.util.HashMap;

public class IncrementValue {

	public static void main(String[] args) {
		   // Given map, update map values each time of iteration

//	        HashMap<String, String> map = new HashMap<>();
//	        map.put("A", "b");
//	        String s="A";
//	        String s2="b";
//      System.out.println(map);
//	        for (int i = 0; i < 3; i++) {
//	        	
//	        	map.put (s,map.get(s)+s2);
//	        
//	        	
//	        	
//	            
//	            System.out.println(map);
//	        }
	        
	     // Given map, increment map values each time of iteration
	      
	            HashMap<String, Integer> map = new HashMap<>();
	           map.put("A",0);

	            String sentence = "ABC";
	          
	            
	            for(char c : sentence.toCharArray()){
	            	
	                System.out.println(map);
	                
	               Integer value= map.get("A");
	               map.put("A",value+1);
	                
	                
	            
	            }          
	            System.out.println(map);
	}   
}


	



