package Day19_HashSet;

import java.util.HashSet;

public class JavaSetEx5 {

	public static void main(String[] args) {
		
		
		//14. Write a Java program to check if a string in hash set
	    // for ex: ["apple", "red", "green"] 
	    // if there is red => has red
	    // else => dont have it
	   
 
		HashSet<String> s= new HashSet<>();
		
		s.add("number");
		s.add("integer");
		s.add("name");
		s.add("age");
		s.add("height");
		
		System.out.println(s);
		
		if(s.contains("number")){
			System.out.println("it has number");
		}else
			System.out.println("it doesn't have it");

	}

}
