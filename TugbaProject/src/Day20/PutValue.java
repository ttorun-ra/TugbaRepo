package Day20;

import java.util.HashMap;

public class PutValue {

	public static void main(String[] args) {
	
		
		
		// Given map, put chars into map
	    
	        HashMap<Character, Integer> map = new HashMap<>();
	        
	        String sentence = "ABC";
	        
	        char[] chars = sentence.toCharArray();
	       
	        //sentence.toCharArray() => ['A', 'B',' C']
	        for (char c : chars) {
	        	
	           map.put(c,0);
	           
	           
	        }
	        
	        System.out.println(map);
	        //output:
	        // {"A"=0}
	        // {"B"=0}
	        // {"C"=0}
	    }
		

	}

