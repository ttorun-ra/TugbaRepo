package Day20;

import java.util.HashMap;

public class CheckBeforeValue2 {

	public static void main(String[] args) {
		// put letters in your map, value = 0
	    // if map contains that letter already print => "I have it"
	    
	        String sentence = "hello";

	        HashMap<Character, Integer> map = new HashMap<>();

	        char[] c = sentence.toCharArray();
	        
	        for (char ch:c) {

	        	
	        	if(map.containsKey(ch)){
	        				        		
	        		map.put(ch,map.get(ch)+1);
//	        	

	       	       
	    }else {
	    	map.put(ch,1);
	    			
	    }
	        	
	}
	        System.out.println(map);
	}
}


