package day7;

public class ConvertingStringToIntegerAndViceVersa {
    public static void main(String[] args) {
        // valueOf() which can be used to convert a number to string
// Converting integer to string
        int number = 10;
        String s1 = String.valueOf(number);
        System.out.println(s1 + 10);
        System.out.println(number + 10);
        System.out.println("______________");
        // Converting string to integer

        String s2 = "30";
        int n2 = Integer.valueOf(s2);
        System.out.println(s2 + 10);
        System.out.println(n2+10);

        // TODO Task 1 : Write a program that
        //take strings and give us result:
        // ex; s1="100", s2="300" = 400

        String A ="100";
        String B = "300";
        int n3 = Integer.valueOf(A);
        int n4= Integer.valueOf(B);

        System.out.println(n3+n4);
        //task 2: Write a program taht
        // take this values and prints average
        // values= { "5",50,2.24,"22",50000}

        String a ="5";
        String b = "22";
        double c =50;
        double d = 2.24;
        double e = 50000;

        int f =Integer.valueOf(a);
        int h = Integer.valueOf(b);
        System.out.println((f+h+c+d+e)/5);




    }
}
