package MyClasses;

public class Personn {
	
	static void update() {
		System.out.println("AAA");
	}
	
}
class insan extends Personn{

	 static void update() {
		System.out.println("BBBBB");
		
	}
     // constructors and static methods can not be overridden
	 // if u write parentclass's static method in subclass, too. 
	 //it is called method hiding
	 // data members cannot be overridden
	 // private, final methods cannot be overridden
	
}