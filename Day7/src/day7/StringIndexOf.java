package day7;

public class StringIndexOf {
    public static void main(String[] args) {
        // 0123
        // first occurance of the letter;
        // lastIndexOf last occurance of the letter;


        String s1 = "Hello ";
        System.out.println(s1.indexOf("H"));

        String s2= "Techno Study";
        int indexS2 = s2.indexOf("ech");

        System.out.println(indexS2);

        System.out.println("___________");

        String s3 = "so something so many";
        int indexS3 = s3.lastIndexOf("so");
        System.out.println(indexS3);


        // Task 1:
        // 2. write a code that count length of string and prints sum of length and index of "e"
        // ex ; "techno" = > 6 + 1 = 7

        String s4 = "Technoe";
        int L = s4.length();
        int M = s4.indexOf("e");
        System.out.println(L + M);
        System.out.println(s4.lastIndexOf("e"));
    }
}
