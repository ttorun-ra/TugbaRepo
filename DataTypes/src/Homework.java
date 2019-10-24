public class Homework {
    public static void main(String[] args) {
        int a = 24;
        int b = 8;
         Addition(a, b);
         Deduction (a,b);
       Multiplication (a,b);
       Division (a,b);
System.out.println(Addition(a,b));
        System.out.println(Deduction(a,b));
        System.out.println(Multiplication(a,b));
        System.out.println(Division(a,b));

    }

    static int Addition(int num1, int num2) {
        return num1 + num2;
    }
    static int Deduction(int num1, int num2) {
        return num1 - num2 ;

    }
    static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }
    static int Division(int num1, int num2) {
        return num1 / num2;

    }
}
