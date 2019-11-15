package MyClasses;

import java.util.Random;

public class OfficeHourMethods {

//	
		/*
		 static method vs non static method
		 
		 return types
		 parameters in the methods
		   
		   
		   
		 */
		
		// void --> not returning anything from the method
		
		public int randomNum(){
			
			
			Random rnd= new Random();
			
			int myRandomNum =rnd.nextInt(100);
			return myRandomNum;
			
		}
		
		public String Name(String name) {
			
			String myName="Ali";
			
			 myName=name;
			 return myName;
		}

	}

