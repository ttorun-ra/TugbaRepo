package day7;

public class StringSubstrings {
    public static void main(String[] args) {
        String string1 = "Hello World";

        // provide beginning index
        System.out.println(string1.substring(6)); // World
        //provide beginning index and index where to stop

        System.out.println(string1.substring(6,7)); // World
        System.out.println(string1.substring(0,1));
        System.out.println(string1.substring(6,7));

        //Task: Write a program that prints your initials
        // ex: Tugba Aydin = T.A

        String s = "Tugba Aydin";
        System.out.println(s.substring(0,1) + s.substring(6,7));
        // Task 2: continue "task 1 " but print this:
        // ex: Tugba Aydin = TA

        String s2 = "Tugba Aydin";
        System.out.println(s2.substring(0,1)+"." + s2.substring(6,7) + ".");

        String s3 = "The quick brown fox jumps over the lazy dog";
        System.out.println(s3.substring(10,25));




    }
}
