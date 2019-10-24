package Day9;

import java.util.Scanner;

public class JavaSwitchInt {
    public static void main(String[] args) {

        // Write a program that prints word represantation of your number

        Scanner scan= new Scanner(System.in);
        System.out.println("provide a number");
        int n=scan.nextInt();
         switch (n){
             case 0:
                 System.out.println("zero");
                 break;
             case 1:
                 System.out.println("one");
                 break;
             case 2:
                 System.out.println("two");
                 break;
             case 3:
                 System.out.println("three");
                 break;
             case 4:
                 System.out.println("four");
                 break;
             case 5:
                 System.out.println("five");
                 break;
             case 6:
                 System.out.println("six");
                 break;
             case 7:
                 System.out.println("seven");
                 break;
             case 8:
                 System.out.println("eight");
                 break;
             case 9:
                 System.out.println("nine");
                 break;
             case 10:
                 System.out.println("ten");
             default:
                 System.out.println("number is not supported");
                 break;

         }

    }
}
