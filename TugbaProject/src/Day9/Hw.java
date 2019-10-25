package Day9;


import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number");

        String s1= scan.nextLine();


        if(s1.equals("zero")){
            System.out.println((int) (0));
        }

        if(s1.equals("one")){
            System.out.println((int) (1));
        }

        if(s1.equals("two")){
            System.out.println((int) (2));
        }

        if(s1.equals("three")){
            System.out.println((int) (3));
        }


    }
}
