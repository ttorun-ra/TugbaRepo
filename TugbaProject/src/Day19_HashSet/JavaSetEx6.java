package Day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class JavaSetEx6 {

	public static void main(String[] args) {
		// 15.Populate you hash set with random number
		//   you hash set size must be 100
	    

        HashSet<Integer> mySet = new HashSet<>();
        ArrayList<Integer> myList= new ArrayList<>();

	        Random r= new Random();
	       
	       
	       
	      for(int i=0; i<=10;i++) {
	    	  
	    	  int numbers=r. nextInt(10);
	       mySet.add(numbers);
	       myList.add(numbers);
	      }   
	       System.out.println(mySet);
	       System.out.println(myList);
	        	
	        }
	}



