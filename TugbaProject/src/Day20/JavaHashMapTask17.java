package Day20;
import java.util.HashMap;

public class JavaHashMapTask17 {

	public static void main(String[] args) {
		
		
		
		 //17. Given map, update the values
	    // Apple 333
	    // Lemon 444
	    
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("Apple", 100);
	        map.put("Lemon", 200);
	        
	        map.replace("Apple", 333);
	        map.replace("Lemon", 444);
	        System.out.println(map);
	        
	        //part2. suppose you have large map, and you need to check
	        // if you have "Apple" there, if you have apple, only then change
	        // its value to 500

	        if(map.containsKey("Apple")) {
	        	map.put("Apple",500);
	        }
	        	System.out.println("it is there" + map );
	        	
	        	
	        	
	        }
	}



	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //		17. count letters in string
		// " BECOME A SOFTWARE TESTER IN 6 MONTHS"
		
//		HashMap<Character,Integer> map= new HashMap<>();
//		
//		String s=" BECOME A SOFTWARE TESTER IN 6 MONTHS";
//		char [] c=s.toCharArray();
//		System.out.println(c);
//		
//		for(int i=0; i<c.length;i++) {
//			
//			if(c.equals(obj))
		

