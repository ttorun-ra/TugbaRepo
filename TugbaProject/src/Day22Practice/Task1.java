package Day22Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		 //Write a Java program to sort a numeric array and a string array.
		
		
		String [] s1= {"day","tugba","name"};
		int [] num= {5,90,6,8,23,55};
		
		Arrays.sort(s1);
		for(String s:s1) {
			System.out.println(s);
		}
		Arrays.sort(num);
		for(int a:num) {
		
		System.out.println(a);

	}
	    int[] numbers = {1, 2, 4, 10, 2, 0};
        String[] names = {"Zeynep", "Serkan", "Bayram"};       

        System.out.println("First Numeric array : "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Numeric array : "+Arrays.toString(numbers));


        System.out.println("First String array : "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted String array : "+ Arrays.toString(names));

        
        
        
        

}
}