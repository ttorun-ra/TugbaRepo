package Day15;
import java.util.Random;

public class ArrayTask3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		// part1. fill array with random values using Random/Math.random,
        //        where length of array is 10 <= array.length <= 100
        // part2. print it in reverse order

        Random rand = new Random();
        int[] a = new int[9];

        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * 10);
//            or
//            a[i] = rand.nextInt(9);


            System.out.println(i);
        }
        {
            System.out.println("-------------");
        }

        for(int i=a.length-1;i>=0;i--)

            System.out.println(i);
    }
    }

	