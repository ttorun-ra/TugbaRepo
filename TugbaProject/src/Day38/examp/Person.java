package Day38.examp;

public class Person {
	
//	public String name;
	private String name;
	
	
     public Person() {
    	 
	System.out.println("In Default Constructor");
   }
     
     public Person(String n) {
    	 name=n;
     }
	public String getName() {
		
		return name;
		
	}
       
	public String giveMeName() {
		
	return name;
}
         public void printDetails() {
	
	      System.out.println("Some details");
}


}
