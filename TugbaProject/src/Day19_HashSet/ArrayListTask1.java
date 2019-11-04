package Day19_HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask1 {

	public static void main(String[] args) {
		   //1. Write a Java program to create a new array list,
	    // add some colors (string) and print out the collection.
		

		ArrayList <String >aalist = new ArrayList<String>();  
		aalist.add("Blue");
	      aalist.add("Red");
	      aalist.add("Yellow");
	      aalist.add("Orange");
	      aalist.add("Pink");
	      
	      System.out.println(aalist);
	      for(String colors :aalist) {
	    	  System.out.print(colors+" ");
	    	  
	      }
	    //2. Write a Java program to iterate through all elements in a array list.

	      for(int i=0; i<aalist.size();i++) {
	    	  System.out.println(aalist.get(i));
	      }
	    //3. Write a Java program to insert an element into the array list at the first position.
	      
	      aalist.add(0," purple");
	      System.out.println(aalist);
	    //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
	      
	      aalist.remove(2);
	      System.out.println(aalist);
	
	    //5. Write a Java program to update specific array element by given element.  
	
	        aalist.set(3,"White");
	        System.out.println(aalist);
	        System.out.println(aalist.get(3));
	        
	     //6. Write a Java program to remove the third element from a array list.
	        
	        aalist.remove(3);
		      System.out.println(aalist);
		      
		 //7. Write a Java program to search an element in a array list.
		      
		      int index = aalist.indexOf("Blue");
		      System.out.println(index);
		      boolean containsBlack = aalist.contains(aalist);
		      if(aalist.contains("black")){
		           System.out.println("it has black color");
		       }else{
		           System.out.println("it doesn't have black color");
		      
		  //8. Write a Java program to sort a given array list.
		      
		     Collections.sort(aalist);
		   
		      System.out.println(aalist);
				
		    //9. Write a Java program to copy one array list into another.
		      
		      ArrayList <String >nlist = new ArrayList<String>(); 
		      nlist.add("Grape");
		      nlist.add("Apple");
		      nlist.add("Tomato");
		      nlist.add("Banana");
		      System.out.println(nlist);
		      Collections.copy(aalist,nlist);
		      System.out.println(nlist);
		      
		    //11. Write a Java program to reverse elements in a array list.
		      
		     // 1st way
		      Collections.reverse(aalist);
		      System.out.println(aalist);
		      System.out.println("-----------------");
		     // 2nd way 
		      ArrayList <String >List2 = new ArrayList<String>(); 
		      for (int i=aalist.size()-1; i>=0;i--) {
		    	  String element=aalist.get(i);
		    	  System.out.println(element);
		    	  List2.add(element);
		      }
		      aalist=List2;
		      System.out.println(List2);
	}
		      
	
	}
	
	

}
