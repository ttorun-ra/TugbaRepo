package Day12;

import java.util.Random;
import java.util.Scanner;
public class RandonNumber {


    public static void main(String[] args) {
//        Random rand = new Random();
//        int randomNumber= rand.nextInt(5);
//        Scanner scan= new Scanner(System.in);
//        int myNumber =-1;
//
//        System.out.println("Random number " + randomNumber);
//        while (myNumber!=randomNumber){
//            System.out.println("Provide a number");
//            myNumber = scan.nextInt();
//        }
//
//        System.out.println("you win the game");
//        System.out.println("number was " + randomNumber);
//
//    }
//
//    }

        System.out.println("Welcome to Guess a Number game!!!");
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // 0 -> 10

        Scanner scan = new Scanner(System.in);
        int myNumber = -1;
        int counter = 0;

        while (myNumber != randomNumber) {
            System.out.println("Provide number");
            myNumber = scan.nextInt();
            counter++;


            if (myNumber < randomNumber) {
                System.out.println("Provide a greater number");
            } else {
                System.out.println("Provide a smaller number");
            }

            if (counter == 3) {
                System.out.println("you failed");
                break;
            }
        }
        if (myNumber == randomNumber) {
            System.out.println("You win the game");
        }
        {
            System.out.println("Number was " + randomNumber);
        }
    }
}
        // end loop if you failed to guess number after 3 try
// fix if statements , check numbers correctly