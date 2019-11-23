package Day36;

public class Task2 {

	public static void main(String[] args) {
		 String[] arr = {"Hi", "Hello", null};

		 
	        // print first characters of words
	for(String word:arr) {
		try {
		System.out.println(word.charAt(0));
	}catch(Exception NullPointerException) {
		System.out.println("it is Ok");
	}
		
	}
	}
		 
	}


