package Day11;

import java.util.Scanner;

public class ForLoops8 {
    public static void main(String[] args) {

//        int counter = 0;
//        int sum = 0;
//        for (int i = 1; i <= 10; i = i + 3) {
//            System.out.println(i);
//            sum += i; // sum=sum+i
//            counter = counter + i;//counter ++
//        }
//    }
//}

//        System.out.println("sum from 1 to 10 with +3 is :" + sum);
//        System.out.println("counter is : " +counter);
//        System.out.println((double)sum/counter);
//    }

        // Task 3
        // write a program with sum up to you provided number
        //


        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a max number");
        int max = scan.nextInt();

        int sum = 0;
        int N=0;
        for(int i = 1; i <=max; i++){
        System.out.println(i);
           sum+=i; // sum=sum+i

            N++; // numbersInLoop

    }
        System.out.println("sum from 1 to max  is :" + sum);
        System.out.println("the average is : " + (double)sum/N);
    }

}
