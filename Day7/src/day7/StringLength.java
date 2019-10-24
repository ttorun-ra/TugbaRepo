package day7;

public class StringLength {
    public static void main(String[] args) {
        // String Length

        String s1 = "ABCDE";
        System.out.println(s1.length());
        // or

        int l = s1.length();
        System.out.println(l);

        String username = "techo.study";

        if (username.length() < 10) {
            System.out.println("you can login");
        }

        if (username.length() >= 10) {
            System.out.println("you cannot login");
        }

        // task 1 : Write a program that sums two string length
        // ex : "ABC", "Z" => 3 + 1 => "Length is 4"

        String s2 = "ABC";
        String s3 = "Z";
        int s4 = s2.length() + s3.length();
        System.out.println("Length is:" + s4);

        // task2: Write a program that check if the subtraction of s1 and s2 is
        // less than 0, if it is less print "can not proceed', else " we can do it"
        // ex: s1 ="LongStringHere", s2 = "ShorterOne" = > " we can do it"'
        // ex: s1 = "short", s2 = "Looooong"

        String a = "LongStringHere";
        String b = "ShorterOne";
        int c = a.length() - b.length();

        if (c < 0) {
            System.out.println("Can not proceed");
        } else {
            System.out.println("we can do it");
        }
        String kl = "short";
        String hm = "Looooong";
        int d = kl.length() - hm.length();


        if (d < 0) {
            System.out.println("Can not proceed");
        } else {
            System.out.println("we can do it");
        }
    }
}
