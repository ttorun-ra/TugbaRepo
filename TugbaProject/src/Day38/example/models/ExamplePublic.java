package Day38.example.models;

import Day38.examp.Person;

public class ExamplePublic {

	public static void main(String[] args) {
		
		Person student = new Person();
		
		student.name="Max";
		
		System.out.println("From Attribute: "+ student.name);
		System.out.println("From Method: "+student.name);

	}

}
