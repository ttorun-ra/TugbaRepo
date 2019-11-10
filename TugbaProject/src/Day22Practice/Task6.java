package Day22Practice;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		// 6. Write a Java program to sort in reverse order a numeric array and a string array.
		
		int [] num= {5,90,6,8,23,55};
		String [] s= {"Rana","Akif","tugba"};
		
		for(int i=num.length-1;i>=0; i--) {
			
			
			Arrays.sort(num);
			
			System.out.println(num[i]);
		}
		
		
        for(int j=s.length -1; j>=0;j--) {
        	
        	Arrays.sort(s);
        	
        	System.out.println(s[j]);
        }
	}

}
