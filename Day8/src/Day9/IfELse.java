package Day9;

public class IfELse {
    public static void main(String[] args) {
        String s1 = "Hi";

        if (s1.equals("hello")) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Dpnt understand");
        }
        int num2 = 10;
        if (num2 > 0) {
            System.out.println("positive");
        } else if (num2 == 0) {
            System.out.println("it is zero");
        } else {
            System.out.println("it is negative");
        }
        String s2 = "Hello";

        if (s2.length() == 6) {
            System.out.println("its have enough length");
        } else if (s2.contains("o")) {
            System.out.println("it has o");
        } else {
            System.out.println("ignore this");

        }
    }
}
