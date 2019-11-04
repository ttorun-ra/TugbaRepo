package Day19_HashSet;

import java.util.Set;
import java.util.HashSet;

public class JavaSetEx3 {

	public static void main(String[] args) {
		
		//2. Write a Java program to iterate through all elements in a hash list.
		
		Set<Integer> setNumbers = new java.util.HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);
        System.out.println(setNumbers);
       
        	for (Integer setNumber : setNumbers) {
                System.out.println(setNumber);
                
        	}    //3. Write a Java program to get the number of elements in a hash set.
        	
        	System.out.println("Number of elements");
                System.out.println(setNumbers.size());
                
              //4. Write a Java program to empty an hash set.
                setNumbers.removeAll(setNumbers);
                
                System.out.println(setNumbers);
                
                HashSet<Integer>set2= new HashSet<>();
                
                set2.add(1);
                set2.add(2);
                setNumbers.removeAll(set2);
                System.out.println("after remove 1 and 2 " + setNumbers);

                
              //5. Write a Java program to test a hash set is empty or not.
                System.out.println(setNumbers.isEmpty());
          
              //6. Write a Java program to clone a hash set to another hash set.
              
                	
                	
                }

        }
	
