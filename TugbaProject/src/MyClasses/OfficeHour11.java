package MyClasses;

import java.util.ArrayList;

public class OfficeHour11 {

	public static void main(String[] args) {
		// break vs continue
		
		/*
		we are using break and continue in the for loop
		when the for loop hit the break it stop the for loop
		when the for loop hit the continue it passes that step in the for loop
		
		
		
*/
		
	// example of the break
		
		for(int i=0;i<100;i++) {
			if(i==50) {
				
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am after the for loop");
		System.out.println("--------------");
		
		// example of the continue
		
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		// verify first array equal to second array
		
		ArrayList<String>list1=new ArrayList<>();
		list1.add("lion");
		list1.add("Tiger");
		list1.add("Elephant");
		list1.add("Cow");
		ArrayList<String>list2=new ArrayList<>();
		
		
		list2.add("Lion");
		list2.add("Tiger");
		list2.add("Cat");
		list2.add("cow");
		
		boolean result=true;
		
		for(int i=0;i<list1.size();i++) {
			
			if(list1.get(i).equals(list2.get(i))) {
				
				result=true;
			}else {
				result=false;
				break;
			}
				
			}
			
			System.out.println("my result is:------"+result);
			System.out.println("-------------");
			
			
			ArrayList<String>list3=new ArrayList<>();
			list3.add("lion");
			list3.add("Dog");
			list3.add("Tiger");
			list3.add("Cat");
			list3.add("Lizard");
			list3.add("Elephant");
			list3.add("Cow");
			
			ArrayList<String>list4=new ArrayList<>();
	        list4.add("Lion");
	        list4.add("Elephant");
	        list4.add("Bird");
	        list4.add("Tiger");
	        list4.add("Zebra");
	        list4.add("Lizard");
	        list4.add("Dog");

			
			boolean check=false;
			  for(int i=0;i<list3.size();i++) {
			   for(int j=0;j<list4.size();j++) {
			    
			    if(list3.get(i).equals(list4.get(j))) {
			     check=true;
			    }else {
			    	check=false;
			    	break;
			     
			    }
			   }
			  
			  }	System.out.println("my result is:------"+check);
				
			  
			  
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

