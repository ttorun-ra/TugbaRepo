package Day11;

public class ForLoops7 {
    public static void main(String[] args) {
// you can not declare the same variable with multiple data types in the same body;

//        for(long y =0,x=1;x<5;x++){
//            System.out.println(x+" ");
//        }

        int N = 0;
        for(int x = 0 ; x<3 ; x++){
            System.out.println(x+" ");

            N = x;
        }
        System.out.println("N is  :" + N);
    }
}
