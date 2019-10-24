package Day8;

public class MathRandom3 {
    // int randomInRange = min + (int) (Math.random() *((max - min) + 1));
    public static void main(String[] args) {

//        int min = 10;
//        int max = 15;
//        int range = max - min;
//
//        int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
//        System.out.println(randomInRange);
//
//        int temperature = randomInRange;
//        System.out.println("Temperature is: " + temperature);
//
//        if (temperature == 100) {
//            System.out.println("Frying");
//        }
//        temperature = 10;
//        if (temperature >= 70) {
//            System.out.println("Its hot");
//        }
//        if (temperature < 70 && temperature >= 60) {
//            System.out.println("Its warm");
//        }
//        if (temperature < 20) {
//            System.out.println("Freezing");
//        }
//        if (temperature < 60 && temperature >= 20) {
//            System.out.println("Cool");

//printing number in range

//                    int min = 0;
//                    int max = 5;
//                    int range = max - min;
//
//                    int randomInRange = min + (int) (Math.random() * (range + 1));
//                    System.out.println(randomInRange);
//
//                    if(randomInRange == 1) {
//                        System.out.println("one");
//                    }
//
//                    if(randomInRange ==2){
//                        System.out.println("Two");
//                        }

                    // Task 1: write a program that prints word representation of random number
        // where number is 0,=N ,=3


        int min = 0;
        int max = 3;
        int range = max - min;

        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        if(randomInRange == 0) {
            System.out.println("zero");
        }


        if(randomInRange == 1) {
            System.out.println("one");
        }

        if(randomInRange ==2){
            System.out.println("Two");
        }
        if(randomInRange == 3) {
            System.out.println("three");
        }






    }
}
