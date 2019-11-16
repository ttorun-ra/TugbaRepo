package Day32;
import java.util.ArrayList;
public class Task2 {

	public static void main(String[] args) {
		  // Write a program with a method named printSum
	    // that accepts ArrayList of integers as an argument and print its sum.
		ArrayList<Integer>myList= new ArrayList<>();
		myList.add(1);
		myList.add(5);
		myList.add(9);

		printSum(myList);
	}

	public static void printSum(ArrayList<Integer> num) {
		int sum=0;
		for(int num1:num) {
			
			sum+=num1;
		}
		System.out.println(sum);
	}
	
}
