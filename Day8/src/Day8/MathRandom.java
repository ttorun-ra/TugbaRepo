package Day8;

public class MathRandom {
    public static void main(String[] args) {
        // Random numbers in java use Math.random()


//        double random = Math.random(); // 0.000001 - 0.99999999
//        System.out.println(random);
//
//        System.out.println("______________");

        // this gives us a random number between 0 and "int max"
//        int max =10;
//        double r1 = random *max;
//        int i1=(int)r1;
//
//        System.out.println(r1);
//        System.out.println(i1);

//         int randomInRange = min + (int) (Math.random() * ((max - min) + 1));

        int max =100;
        double r1 = Math.random() *max;
        int i1=(int)r1;

        System.out.println(r1);
        System.out.println(i1);

        // Task 1: print random number between 0 and 100
        // Task 2: print 2 random numbers between 0 and 10:

//        double r=Math.random();
//        System.out.println(r);
//        double r2=Math.random();
//        System.out.println(r2);



    }
}

