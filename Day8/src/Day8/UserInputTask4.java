package Day8;
import java.util.Scanner;
public class UserInputTask4 {

    // Write a program that prints word representation of your number
    // where number is 0<=N<=3
    // ex:0 => zero
    //2. Write a program that prints number of word representation number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a number");


        int a1 = scan.nextInt();
        if (a1 == 0) {
            System.out.println("Zero");
        }

        if (a1 == 1) {
            System.out.println("One");
        }
        if (a1 == 2) {
            System.out.println("Two");
        }
        if (a1 == 3) {
            System.out.println("Three");

        }
    }



}

