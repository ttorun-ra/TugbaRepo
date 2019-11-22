package MyClasses;

public class PracticeReturn {

	public static void main(String[] args) {
		
		
		String name1="Ayse";
		String name=printMyName();
		
		System.out.println(name);
		
		System.out.println(myNumber());
		
		int a=myNumber();
		
		System.out.println(a);

	}
	
	public static String printMyName() {
		return "Tugba";
	}
	public static int myNumber() {
		int num=1;
		int num2=3;
		return num+num2;
	}

}
