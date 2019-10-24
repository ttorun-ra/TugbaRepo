package Day11;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Provide a number");
//        int num = scan.nextInt();
//
//        for(int i =1; i<=num;i++){
//            System.out.println(i);
//        }
        // task 1 write a program that takes "a" and "b" numbers from the console, and show multiplication up to that"a" number
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a:");
        int a= scan.nextInt();
        System.out.println("Provide b:");
        int b=scan.nextInt();

        for(int i =1; i<=a; i++) {
            System.out.println(b*i);
        }
    }
}
