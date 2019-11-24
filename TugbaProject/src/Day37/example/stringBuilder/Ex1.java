package Day37.example.stringBuilder;

public class Ex1 {

	// Given string reverse that string
	
	public String reverseString(String str) {
		
	//	String abc="a"+"b"+"c";
//      String s1 = "a";
//      String s2 = "ab";
//      String s3 = "abc";

		StringBuilder sb= new StringBuilder();
		
		sb.append(str);
		
		
		String sbString=sb.toString();
		
		
		
		sb.append(str); // adding smt to the right of the string
		
		StringBuilder reverse=sb.reverse();
		String result=reverse.toString();
		
		return " ";
		
//      "prepend"+"initial point" + "append"


 


     



	}

}
