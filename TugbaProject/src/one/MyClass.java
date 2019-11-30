package one;

public class MyClass {

	public static void main(String[] args) {
		
		
		Person.school="Clifton";
		
		Person b= new Person();
		b.name="Bob";
		
		System.out.println(Person.school);
		System.out.println(b.name);
		
		Person age1=new Person();
		Person.age=30;

		Person age12 = age1;
		age12.age1=25;
		
		Person age2=new Person();
		
		age2.age1=13;
		
		System.out.println();
		
		System.out.println(age12.age1);
		
		System.out.println(age2.age1);
		
		age12.age1=16;
		
		System.out.println(age12.age1);
		
		Person.age=15;
		
		
		System.out.println(Person.age);
	}
}
	   
	 
