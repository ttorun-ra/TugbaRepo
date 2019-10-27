package Homework;

import java.util.Random;

public class HwOctober26thArrays {

	public static void main(String[] args) {
		
		 // Task
	    // 1. Return the number of even ints in the given array.
	   
		
		Random rand= new Random();
		
		int [] arr = new int [20];
		
		for (int i =0; i<arr.length;i++) {
			
			arr[i]=rand.nextInt(20);
//			System.out.println(arr[i]);
			
		if(arr[i]%2==0) {
			
			System.out.println(arr[i] + "  it is an even number");
		}
		}

	}

}
