package Day11;

public class ForExp2 {
    public static void main(String[] args) {

        int N = 0;
        int sum = 0;

        for(int x = 0 ; x<=5 ; x++){
            sum= sum + x;

            N++;
            System.out.println(N);
        }
        System.out.println("Sum is  :" + sum);
        System.out.println("Average is : " + ((double)sum/N));
    }

}
