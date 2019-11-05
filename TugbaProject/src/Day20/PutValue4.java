package Day20;

import java.util.HashMap;

public class PutValue4 {

	public static void main(String[] args) {
		
	HashMap<Character,Integer> s=new HashMap<>();
	
	 String sentence = "hello";
	 
      char[] ch= sentence.toCharArray();
      
      for(char c:ch) {
    	  
    	  s.put(c,0);
      }
            System.out.println(s);
	}

}
