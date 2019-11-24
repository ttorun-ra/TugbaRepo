package Day38.example.models;

import Day38.examp.Person;

public class ExamplePrivate {

	public static void main(String[] args) {
	Person student= new Person();
	
//	student.name=
	Person student2= new Person("Lee");
	
	System.out.println("From Method: "+ student2.giveMeName());

	}

}
