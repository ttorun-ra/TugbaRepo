package com.company;

public class BasicProblem{

    public static void main(String[] args) {




        int a = 2;
        System.out.println(a);
        a = a * 1 ;

        System.out.println("2 * 1 =" + a);

        a = a * 2 ;

        System.out.println("2 * 2 =" + a);

        a = a * 3/2 ;

        System.out.println("2 * 3 =" + a);

        int numA = 2;
        int numB = 1;
        System.out.println(numA * numB);

        numB = numB + 1 ;
         System.out.println(numA * numB);

        numB = numB + 1 ;
        System.out.println(numA * numB);


        numA = 2;
        numB = 1;
        int result = numA * numB;
        System.out.println("2 * 1 =" + result);

        numB = numB + 1;
        result = numA * numB;
        System.out.println("2 * 2 = " + result);
    }
}
