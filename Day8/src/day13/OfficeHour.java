package day13;

public class OfficeHour {
    public static void main(String[] args) {


//        //print even numbers 1-100
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("even numbers are here " + i);
//            }
//        }
//
//        //print odd numbers 1-100
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 1) {
//                System.out.println("odd numbers are here " + i);
//            }
//
//            // enter 3 numbers and find the bigger one
//
//
//            int i1 = 10;
//            int i2 = 12;
//            int i3 = 9;
//
//            if (i1 > i2 && i1 > i3) {
//                System.out.println("this is the biggest number" + i1);
//
//            } else if (i2 > i1 && i2 > i3) {
//                System.out.println("this is the biggest number" + i2);
//            } else {
//
//                System.out.println("this is the biggest number" + i3);
//
//
//                //print prime numbers from 1 to 100
//
//            }

        int i = 0;
        int a = 0;
        for (i = 1; i <=100; i++) {
            int c = 0;
            for (a = i; a >= 1; a--) {
                if (i % a == 0) {
                    c = c + 1;
                }
            }
                if (c == 2) {
                    System.out.println("it is a prime number " + i);
                }
            }
        }
    }






//            }
//
//        }}
//
//    }
//}
