package Day8;
//To get random number between 0 and N, multiply Math.random() with N
//formula: Math.random()*N, where N is integer

public class MathRandom2 {

    // task2:print 2 random numbers between 0 and 10:
    // ex:4
    //ex: 5
    public static void main(String[] args) {
        double r=Math.random();
        System.out.println(r);
        double r2=Math.random();
        System.out.println(r2);
        System.out.println("________");



        System.out.println(Math.random());
        int max = 10;
        int a= (int) (Math.random() * max);

        System.out.println(a);

        double d1 = Math.random();
        System.out.println(d1);
        System.out.println(d1 * 10);
        int i1 = (int)(d1 *10);
        System.out.println(i1);
        System.out.println("---------------");
        //0 - 1000
        System.out.println((Math.random()*1000));

        //sample
        // 0.2 * 10 => 2
        //

        System.out.println((int)(Math.random()*10));

        System.out.println((int)(Math.random()*10));

        // 2. way
        int max1 = 10;

        double r1 = Math.random() * max;
        int i3 = (int) r1; // gets integer form double
        System.out.println(i1);

        double r3 = Math.random() * max;
        int i4 = (int) r3; // gets integer form double
        System.out.println(i4);







    }
}

