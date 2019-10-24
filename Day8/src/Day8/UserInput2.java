package Day8;
//Task 1:
// Write a program that ask a number:
// example
// Provide a number:

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Provide a number: ");
//        int number= scan.nextInt();
//
//        System.out.println("Your number is " + number);


        // Task 2:
        // Write a program that ask two number,
        //  in your console it should print same as below:
        //    // Provide a first number:5
        //    // 3
        //    // Your first number is 3
        //    // Provide a second number:
        //    // 5
        //    // Your second number is 5

//        Scanner A = new Scanner(System.in);
//        System.out.println("Provide a number");
//
//
//        int n = A.nextInt();
//
//        System.out.println("your first number is " + n);
//
//        System.out.println("Provide a second number");
//
//        int n2 = A.nextInt();
//
//        System.out.println("your second number is " + n2);

        Scanner B = new Scanner(System.in);

        System.out.println("Provide a number");

        int b = B.nextInt();
        System.out.println("your number is : " +b);

        if (b<0){
            System.out.println("it is negative");
        }
        else{
            System.out.println("it is positive");
        }

    }
}
