package Day12;

import java.util.Random;
import java.util.Scanner;

public class testYourself {
    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(8);
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (num != rnd) {

            System.out.println("Write a number");
            num = scan.nextInt();

            if (num >= rnd) {
                System.out.println("you are fine ");
            } else {
                System.out.println("try another one");
            }
        }
            {
                System.out.println("My random was " + rnd);
            }

    }
}
