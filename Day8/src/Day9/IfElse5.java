package Day9;



import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {


        // byte -128->127
        // Write a program check what number datatype it is?
        // 23 =>byte
        // 12312=> int
        // 123123123=> Long
        //Hint:byte <short <int<long

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number please:");
        long number = scan.nextLong();

        if (number >= -128 && number <= 127) {
            System.out.println("DataType is byte");
        }
        else if(number >= -2147483648 && number<=2147483648L){
            System.out.println("DataType is int");
        }
        else if (number >= -9223372036854775808L && number <= Long.MAX_VALUE){
            System.out.println("DataType is Long");
        }
        else {
            System.out.println("end");
        }
    }
}
