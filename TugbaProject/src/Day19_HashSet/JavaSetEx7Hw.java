package Day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSetEx7Hw {

	public static void main(String[] args) {
		// you have list of numbers, determine if you have duplication here
		//  //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
	    //ex2: [1, 2, 3] => no duplications
	   
	       ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(5);
	        numbers.add(5);
	          
//	        
	        HashSet set = new HashSet(numbers);
//	        
//	        System.out.println( numbers.size());
//	        System.out.println(set);
//
//	        if(numbers.size()> set.size()) {
//	        	System.out.println("there is a duplication");
//	        }

	        
//	        }
//}
// 2nd way
	        
	        System.out.println("2nd way");
	        
	        for(Integer number: numbers) {
	        	if(set.contains(number)) {
	        		System.out.println("set already has this number");
	        		
	        	}else
	        		 set.add(number);

	        	
	        }

	       System.out.println(numbers);
	       int count=0;
	       
	      for(int i =0; i<numbers.size();i++) {
	    	  for(int a=0; a<numbers.size();a++) {
	    		  
	    	  if(numbers.get(i).equals(numbers.get(a)) && i!=a) {
	    			 count=count+1; 
	    			 
	    		  }	 
	    	  }
	    	  if(count>=2 ) {
	    		  System.out.println( numbers.get(i)+ " has " + "a duplication");}
	    		  else
	    			  {System.out.println("there is not a duplication");}
	    	  
	    	  count=0;
	      }
	      }
	      }
	    	  
	    
	    			 
	
	    	  
	       
	       
	


