package Day32;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		  // Write a program with a method named getSum
	    // that accepts ArrayList of integers as an argument and print its sum in main.

	
	ArrayList<Integer>myList= new ArrayList<>();
	myList.add(1);
	myList.add(5);
	myList.add(9);

	int sum=getSum(myList);
	System.out.println(sum);
}

public static int getSum(ArrayList<Integer> num) {
	
	int sum=0;
	for(int num1:num) {
		
		sum+=num1; 
		
}
	return sum;
}
}