package Day22Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {

	public static void main(String[] args) {
		
		// 13. Write a Java program to convert an array to ArrayList
		
		int [] num= {5,90,6,8,5,23,5,6,55};
		
		ArrayList<Integer> a= new ArrayList<>();
		
		for(int i=0;i<num.length;i++) {
			
			
			a.add(num[i]);
		}
          System.out.println(a);
	}

}
