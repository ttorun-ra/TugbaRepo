package Day12;

import java.util.Scanner;

public class DoWhileTask2 {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    String pin;
        do {
        System.out.println("please write a pin");
        pin = scan.nextLine();
        if(pin.length()!=4){
            System.out.println("incorrect pin");
        }

    } while (!pin.equals("9999"));

        System.out.println("take your card");
}

}
