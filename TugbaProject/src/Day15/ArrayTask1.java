package Day15;

import java.util.Random;
public class ArrayTask1 {

	public static void main(String[] args) {
		
		 //TODO Task
	    // part1. fill array with random values using Random/Math.random, 
//		10 < array.length < 100
	    // part2. find average or array;
	    //  ex: [1, 5, 6, 8] => 20/4 => 5
		
		Random rand=new Random();
		 
		int arr [] = new int[100];
		
		
	        
		double sum = 0;

	        for (int i = 10; i < arr.length; i++){

//
//	            arr[i] = (int)(Math.random()*100);
	            arr[i]=rand.nextInt(100);
	            
	            
	            sum += arr[i]; // it needs to be there, if i put before random numbers, wont print sum

	            System.out.println(arr[i]);

 
	        }
//	      

	        System.out.println(sum);
	        System.out.println("average " + sum/arr.length);




	    }

	}
		