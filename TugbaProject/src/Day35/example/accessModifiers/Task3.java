package Day35.example.accessModifiers;

class Students{
	
	private String studentName() {
		return "Akif";
		
	}public String lastName() {
		String a=studentName();
		String b=a+"Aydin";
		return b;
		
	}
}

public class Task3 {

	public static void main(String[] args) {
		 // create class
	    // create private method
	    // use public method to access to private method

          Students n=new Students();
		System.out.println(n.lastName());
	}

}
