package Day32;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		   // Write a program with a method named printAverage
	    // that accepts ArrayList of integers as an argument and print its average.
		ArrayList<Integer>myList= new ArrayList<>();
		myList.add(1);
		myList.add(5);
		myList.add(9);

		printSum(myList);
	}

	public static void printSum(ArrayList<Integer> num) {
		double average=0;
		double sum=0;
		for(int num1:num) {
			
			sum+=num1;
		
		}
		average=sum/num.size();
		System.out.println("the average is: "+ average);
	}
	
}

	