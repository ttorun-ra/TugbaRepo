package Day11;

public class WhileLoop {
    public static void main(String[] args) {
//        for(int i =1; i<=5;i++){
//            System.out.println(i);
//        }
//        int i =1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }

        boolean b =true;
        int i =0;
        while(b){
            System.out.println(i);
            i++;
            if (i == 5) {
                b=false;
            }
        }
    }
}
