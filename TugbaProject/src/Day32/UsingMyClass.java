package Day32;

public class UsingMyClass {

	public static void main(String[] args) {
		

		Person m= new Person();
		
		String text=m.getBody();
		
		System.out.println(text);

		
		m.name="Ali";
		
		String name=m.getName();
		
		System.out.println(name);
		
		Person richard= new Person();
		
		System.out.println(richard.getName());
		System.out.println(richard.urlToGoogle);
		
	}

}
