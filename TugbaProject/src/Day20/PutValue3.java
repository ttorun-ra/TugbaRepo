package Day20;

import java.util.HashMap;

public class PutValue3 {

	public static void main(String[] args) {
		// Put first names and last names into your map, and print
		
		 HashMap<String, String> NL = new HashMap<>();
		 
	        String[] firstNames = {"Max", "Drake", "Susan"};
	        
	        String[] lastNames = {"Smith", "Jones", "Miller","Aydin"};
	        
	        for(int i=0; i<firstNames.length;i++) {
	        	
	        	NL.put(firstNames[i],lastNames[i]);
	        }
	      
	      System.out.println(NL);	        
	        	        	        	        	       	      
	    }


	}


