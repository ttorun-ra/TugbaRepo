package Day35.Task;

class Person{
	
	public String name;
	public int age;
	public String eyeColor;
	public boolean good;
	


  public Person(String n) {
	         name=n;
}public Person(int a){
	
	age=25;
	
}public Person(){
	eyeColor="green";
	
}public String print() {
	
	return  "Name:"+name+"\n"+"Eye Color: "+ eyeColor + "\n"+ " age: " +age;
	
}
}	

      public class Task2 {	   	

	public static void main(String[] args) {
		 Person p=new Person();
		 
		 p.name="Ayse";
	    	
	      Person a=new Person();
	      a.age=25;
	      
	      Person c=new Person();
	      c.eyeColor="green";
	      
	    
	      
	      System.out.println(p.print());

	}

}
