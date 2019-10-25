package Day11;


import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Write a string");
//        String s = scan.nextLine();
//        //
//        while (!s.equals("o")) { //s != "exit"
//            System.out.println("Write a string");
//            s = scan.nextLine();
//
//        }
//
//    }
//}

        // task : write a program which asks you to provide a text
        // and it should stop when you type "quit"

        Scanner b = new Scanner(System.in);
        System.out.println("Provide a text");

        String line = b.nextLine();

       // part1
        while (!line.equals("quit")) { //s != "exit"
            System.out.println("Write a string");
            line = b.nextLine();

            //part2
            if (line.length() >= 10) {
                System.out.println("string is too large");
            }
            if(line.equals("tugba")){
                System.out.println("My last name is :" +" Aydin");
            }
        }
    }
}



