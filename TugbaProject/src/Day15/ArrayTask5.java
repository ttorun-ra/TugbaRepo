package Day15;
import java.util.Random;
public class ArrayTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //TODO
        // part1. fill array with random values using Random/Math.random, 0 <= random N <= 10
        // part2. check if an array of has 0, print => "it has zero"
        // part3. check if array has 10, print => "it has 10"
        // part4. if array has 0 or 10, print the indices(indexes) of them
        // ex:  31 90 0 123 4  0
        //  it has zero
        //  it has zero

            Random random = new Random();

            int[] randomNumbers = new int[10];
            //part1
            System.out.println("PART1-----------------------------");

            for (int index = 0; index < randomNumbers.length; index++) {

                randomNumbers[index] = random.nextInt(10);

                System.out.print(randomNumbers[index]+ " ");
            }

            //part2
            System.out.println("\nPART2-----------------------------");
            for (int index = 0; index < randomNumbers.length; index++) {
                if(randomNumbers[index] == 0){
                    System.out.println("it has zero");
                }
            }


	}

}
