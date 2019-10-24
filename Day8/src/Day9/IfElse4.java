package Day9;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write a program that print temperature in human readable words
        // ex;70=> hot

        int t = scan.nextInt();

        if(t >= 70){
            System.out.println("it is hot");
        }
        else if(t < 70 && t >=50){
            System.out.println("it is warm");
        }
        else if( t>20 && t <50){
            System.out.println("it is cold");
        }
        else{
            System.out.println("freezing");
        }
    }
}
