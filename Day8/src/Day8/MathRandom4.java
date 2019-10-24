package Day8;

public class MathRandom4 {
    // int randomInRange = min + (int) (Math.random() *((max - min) + 1));
    public static void main(String[] args) {

        int min = -200;
        int max = 200;
        int range = max - min;

        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        // Task2:
        // check if random number is positive or negative

//        if (randomInRange < 0) {
//            System.out.println("it is negative");
//        }
//        if(randomInRange>0){
//            System.out.println("it is positive");
//            //


            // Task 3:
            // if random number is odd or even

            if (randomInRange%2==0){
                System.out.println("it is even");
            }
            if(randomInRange%2!=0){
                System.out.println("it is odd");
            }
        }

    }