package day7;

import javax.swing.*;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        // Concatenating Strings
        String s1 = "Hello ";
        String s2 = "World!!!";
        String s9 = "YES";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(s2).concat(s9));



        // task:use seperate variable for each word print it in one line
        // using concatenation
        // ex: "What","is","your","name","?' => "What is your name?"

        String s3 = "What";
        String s4 = "is";
        String s5 = "your";
        String s6 = "name";
        String s7 = "?";
        String space = " ";
        System.out.println(s3 + space + s4 + space + s5 + space + s6 + space + s7);
        System.out.println(s3.concat(space + s4 + space + s5 + space + s6 + space + s7));

space ="\n";
        System.out.println(s3 + space + s4 + space + s5 + space + s6 + space + s7);
    }
}
