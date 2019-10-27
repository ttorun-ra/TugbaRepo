package Day15;
import java.util.Random;
public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand=new Random();

	        int arr [] = new int[100];




	        double sum = 0;

	        for (int i = 10; i < arr.length; i++){


	            arr[i] = (int)(Math.random()*100);

	            sum += arr[i]; // it needs to be there, if i put before random numbers, wont print sum

	            System.out.println(arr[i]);


	        }
	//

	        System.out.println(sum);
	        System.out.println("average " + sum/arr.length);




	    }

	}


	
