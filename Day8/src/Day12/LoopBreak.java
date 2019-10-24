package Day12;

import Day8.MathRandom;

import java.util.Random;

public class LoopBreak {
    public static void main(String[] args) {
//        int number = 0;
//
//        for (int i = 0; i <= 10; i++) {
////            System.out.println(i);
//            if (i == 5) {
//                number=i;
//                break;
//            }
//        }
//        System.out.println("your number is: " + number);


        /// run loop to 100000000,
        // and exit that loop when i is equal to 232558

        //part2, continue part1, but instead of that number use some math random


//        int number = 0;
//
//        for (int i = 0; i <= 100000000; i++) {
//            System.out.println(i);
//            if (i == 232558) {
//
//                number=i;
//                break;
//            }
//        }
//        System.out.println("Your number is"+ number);


//        int number = 0;
//        Random rnd= new Random();
//        int rand=rnd.nextInt(1000000);
//
//
//        for (int i = 1; i <= rand; i++) {
////            System.out.println(i);
//            if (i == rand) {
//                number = i;
//                break;


//            }
//        }

        int number = -1;

        Random rand = new Random();
        int someRandomNumber = rand.nextInt(100);
        int someRandomNumber1 = (int) (Math.random() * 100000000);
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i == someRandomNumber) {
                System.out.println("----------------");
                number = i;
                break;


            }
        }
        System.out.println("Your number is"+ number);
    }
}