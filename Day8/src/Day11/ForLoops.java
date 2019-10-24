package Day11;

public class ForLoops {
    public static void main(String[] args) {
        int a;
        a = 1;
        System.out.println(a);
        a = 2;
        System.out.println(a);
        a = 3;
        System.out.println(a);
        a = 4;
        System.out.println(a);
        a = 5;
        System.out.println(a);
        forLoopExample();
    }

    private static void forLoopExample() {
//            for (int i = 1; i < 5; i ++) {
//
//                System.out.println(i);
//
//                for (int i= 5; i>=0; i-=2) {
//                    System.out.println(i);
//            }
//                for (int i = 1; i < 5; i ++) {
//
//                    System.out.println(i);

        for (int i = 0; i <= 30; i+=3){
            System.out.println(i);
        }
    }
}




