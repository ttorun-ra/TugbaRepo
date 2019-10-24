package Day11;

import java.util.Scanner;

public class WhileTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write a text: ");
            String line = scanner.nextLine();

            if (line.equals("quit")) {
                break;
            }
            //part1 check for the @,$,*

            if (line.contains("#")) {
                System.out.println("Strong Password");
            }
            // part1. check for the @,$,* symbols also for a strong password

            if (line.contains("@") || line.contains("$") || line.contains("*")) {
                System.out.println("Very Strong Password");
            }
            if(line.equals(line.toUpperCase())){
                System.out.println("use Lowercase");
            }
            if(line.equals(line.toLowerCase())){
                System.out.println("use Uppercase");
            }
            // part3.check the text if it is only uppercase print "use Lowercase"
            // part 4.check the text if it is only lowercase print "use uppercase"
        }
    }
}
