package Day11;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("begin");
        while (true){
            System.out.println("Write text: ");
            String str = s.nextLine();

            if(str.equals("quit")){
                break;


            }
        }
        System.out.println("end");
    }
}
