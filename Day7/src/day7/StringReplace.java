package day7;

public class StringReplace {
    public static void main(String[] args) {

        String s1 = "Hello World";
        System.out.println(s1.replace("o","@"));

        String s2 = "one two one three";

        System.out.println(s2.replace("one","four"));
        String s3 = "name;surname;age;grade;class";
        System.out.println(s3.replace(";"," "));

        //task 1:
        // Write a program that replace your name with your last name

        String myName = "Tugba Aydin";
        System.out.println(myName.replace("Tugba", "Aydin"));
    }

}
