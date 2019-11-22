package MyClasses;

public class AliOfficeHour {

	
	
		/*
		 non static variable and methods
		 
		 Creating the object in java
		 
		 What is static?
		 
		     if you have a non-static variable you need to create an object in the static method
		     
		     if you have a static variable you can call it in the static method and non-static method-- if variable
		      and method in the same class
		      else if 
		 
		
		 */
//		 
		 int id=10;
		 String name="Ali";
		 
		 static int countofStudent=0;
		 int nonStaticCountofStudent=0;
		 
		 
		 public void method1() {
			 
//			 System.out.println(id);
//			 
//			 System.out.println("name is here--->>"+name);
			 countofStudent++;
			 System.out.println("count of student here---->"+countofStudent);
			 nonStaticCountofStudent++;
			 System.out.println("nonstatic count of student here---->"+nonStaticCountofStudent);
			 
		 }
		 
		 public static void methodStatic() {
			 countofStudent=10;
			 System.out.println(countofStudent);
		 }		 
			 


		 public static void main(String[] args) {
////			 
////			 
//	 System.out.println(id);
//		 System.out.println("name is here--->>"+name);
////			 
	 AliOfficeHour o1= new AliOfficeHour();
////			 
	 o1.method1();
	 System.out.println(o1.name);
////			 
	 AliOfficeHour o2= new AliOfficeHour();
//		 
	 o2.method1();
			 
	}
}


