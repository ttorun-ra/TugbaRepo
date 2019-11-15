package Day23Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Task8 {

	public static void main(String[] args) {
		 // Given arrayList of chars
	    // print true if they have repetitive letters
	    // {'A','B','B'} => true
	    // {'C','D'} => false

	ArrayList<Character> alist=new ArrayList<>();
		
		alist.add('a');
		alist.add('b');
		alist.add('a');
		
			
			HashSet<Character>mySet=new HashSet<>();
			
			for(Character a:alist) {
				mySet.add(a);
				
			}
			System.out.println(alist);
			System.out.println(mySet);
			
			if(alist.size()!=mySet.size()) {
				System.out.println("there is a repetition");
								
			}else {
				System.out.println("there is not");
			
		}						
}	
	
}