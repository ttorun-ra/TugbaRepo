package Day20;

import java.util.HashMap;

public class CheckBeforePutValue {

	public static void main(String[] args) {
		HashMap<Character,Integer> s=new HashMap<>();
		
		 String sentence = "johnny hello";
		 
	      char[] ch= sentence.toCharArray();
	      
	      for(char c:ch) {
	    	  
	    	 if(c=='h')
	    	 {
	    		 s.put(c,0);
	    	 }
	      }
	            System.out.println(s);
		}

	}


