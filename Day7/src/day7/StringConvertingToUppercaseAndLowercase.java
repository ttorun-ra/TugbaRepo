package day7;

public class StringConvertingToUppercaseAndLowercase {
    //you can convert Strings to uppercase and lowercase
    // using the methods toUpperCase() and toLowerCase()


    public static void main(String[] args) {

        String s1 = "techno study";

        System.out.println(s1.toUpperCase());

        //
        // to convert to uppercase TECHNO STUDY use toUpperCase()

        System.out.println("______________");
        String s2 = "HeLLo WoRlD";
        System.out.println(s2);
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());

        // TODO task 1:
        // print your name in "UPPERCASE" and surname in "Lowercase"
        String s3 = "TugBA";
        String s4 = "aYdIn";
        System.out.println(s3.toUpperCase() +" " + s4.toLowerCase());

        // Write a program that checks if a number is a palindrome:
        ////    ex: 1234 => not palindrome :(
        ////    ex: 123321 => palindrome !!!
        ////    ex: 12321 => palindrome !!!

    }
}


