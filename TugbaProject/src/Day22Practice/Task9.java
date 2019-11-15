package Day22Practice;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
	//	9. Write a Java program to find the second largest element in an array.
		
		int [] num= {5,90,6,8,23,55};
			
		
		for(int i=0; i<num.length;i++) {
			
			Arrays.sort(num);
		
		System.out.println(num[i]);
		}	
	
		int max2=num[num.length-2];
		System.out.println(max2);
				
		
		
	}

	
	// withoutSorting


	 

}