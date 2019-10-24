package day7;

import java.sql.SQLOutput;

public class CreatingString {
    public static void main(String[] args) {
        String s1 = "hello 1";
        String s2 = "hello 1";
        String s3 = " hello 1";

        if (s1 == s2) {
            System.out.println("it is equal");
        }
        String s4 = new String("ABC");
        String s5 = new String("ABC");
        if (s4 == s5) System.out.println("its equal again 2");
    }
}

