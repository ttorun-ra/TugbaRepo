package Day9;

import java.util.Scanner;

public class JavaSwitchInt2 {

    // Write a program which will tell you day of week
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("provide a number");

        int dayOfWeek = scan.nextInt();

        switch (dayOfWeek) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
// task2 / homework
//Continue task 1, but do opposite