package Day32;

public class TechnoTask {

	public static void main(String[] args) {
		
		String a=printTechno();     // always think step by step. in your first line which is your first step
		//you have String a=printTechno(); 
		                                // and it goes down and check the method what there is inside the method. if you go
		// down you will see you have return "Techno" and it takes it(returns) to the your main and after that 
		//you have System.out.println(a.charAt(0)); and it prints out your first index of
		//string(which is techno because you took it from the method by calling) and output gives T.
		// after that step you have System.out.println("Study"); and now it runs that. 
		//That's why your output is :T 
		//                           Study
		
	System.out.println(a.charAt(0));
		
		System.out.println("Study");
	

	}
	public static String printTechno() {
		
		
		return  "Techno";

}
}
