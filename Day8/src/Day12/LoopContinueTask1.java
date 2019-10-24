package Day12;

public class LoopContinueTask1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Start of iteration " + i);

            // if number is even continue
            // else print that number

            if (i % 2 == 0) {


                continue;
            } else {
//                System.out.println("Number is " + i);

            }

            System.out.println(" End of iteration " + i);

        }
    }
}