package Day11;
import java.util.Scanner;
public class bbbbb {

//
//        public static void main(String[] args) {
//            int i = 1;
//            while (i <= 5) {
//                System.out.println("while hi"+i);
//                i++;
//            }
//            //do-while loop
//            int j = 1;
//            do {
//                System.out.println("do-while Hi"+j);
//                j++;
//            } while (j <= 5);
//
//            System.out.println("do-while Hi 2");
//        }
//    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 6; i += 2) {
            System.out.println("give a number ");
            int a = scan.nextInt();
            total++;
            System.out.println(total);
        }

    }
}

