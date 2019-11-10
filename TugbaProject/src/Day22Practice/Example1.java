package Day22Practice;

public class Example1 {

	public static void main(String[] args) {
		String s1="Hello World";
		char c= s1.charAt(0);
		Character c1=s1.charAt(0);
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(8));
		
		int length=s1.length();
		System.out.println(length);
		
		System.out.println(s1);
		System.out.println(s1.trim());
		
		char[] charArray= s1.toCharArray();
		
		charArray[0]='A';
		
		System.out.println(charArray);

	}

}
