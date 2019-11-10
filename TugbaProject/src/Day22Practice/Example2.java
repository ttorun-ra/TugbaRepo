package Day22Practice;

import java.util.Arrays;
import java.util.ArrayList;


public class Example2 {

	public static void main(String[] args) {
//		String s1="Hello my World in my space";
//		
//		String [] array =s1.split(" ");
//		
//		for(String s:array) {
//			
//			System.out.println(s);
//			System.out.println(array[3]);
//		}
		
		int [] array= {1,5,3,10,33,100};
		for(int n: array) {
			
			System.out.println(n+" ");
		}
		System.out.println();
		
		Arrays.sort(array);
		
		for(int n:array) {
			
			System.out.println(n+" ");
		}
		
        
	}
	
	ArrayList<Integer> alist=new ArrayList<>();
	
	
	
	
	
	
}
