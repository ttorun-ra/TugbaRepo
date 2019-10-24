package Day11;

public class ForLoop5 {
    public static void main(String[] args) {
//        for (int i = 1, j = 2; i <= 10; i++) {
//            System.out.println(i * j);
//        }
//        for (int a = 1, b = 2; a <= 10; b< 5; a++, b++){
//            System.out.println();
//        }
                for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.print(" i = " + i);
            System.out.print(" j= " + j);
            System.out.print(" k =" + k);
                    System.out.println();
        }
    }
}
