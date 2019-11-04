package Day20;

import java.util.HashMap;
import java.util.HashSet;

public class JavaHashMapTask18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //17. Count letters in string
	    //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
	    // for ex:
	    // A: 2
	    // B: 1
	    // ...
	    //part 1
	    // print every character in separate line
	    
	    //part2
	    // put every character in HashSet
	    
	    //part3
	    // put every character in HashMap<Character, Integer>
	    
	    //part4
	    // when you are putting check if you have that letter already, if you have, increment value
	    
	    //part5
	    //print HashMap
	    
	    
	    
	    
		
//		
		String s=" BECOME A SOFTWARE TESTER IN 6 MONTHS";
		
		 HashSet<Character>set2= new HashSet<>();
		
//		for(int i=0; i<s.length();i++) {
//			
//		char[] c=s.toCharArray();
////		System.out.println(c[i]);
//		
//		 
////		  
//		  set2.add(c[i]);
//		  
//		}  System.out.println(set2);
		
		HashMap<Character,Integer> map1=new HashMap<>();
		for(int i=0; i<s.length();i++) {
			char[] c=s.toCharArray();
			
			map1.put(c[i], 0);
		
			System.out.println(map1);
		
	if(map1.containsKey(c[i])) {
		
		map1.put(c[i], 1);
	}else
		ma
		 
	
		}

	



