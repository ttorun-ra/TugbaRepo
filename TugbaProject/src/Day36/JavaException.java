package Day36;

public class JavaException {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		try {
			
		int result=a/b;
	}catch(Exception ex) {
		System.out.println("hey don't you know Math");
	}finally {
		System.out.println("Finally Part");
	}
		System.out.println("The end of application!!!");
	}

}
