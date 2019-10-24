package day7;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1 = "YES";
        String s2 = "YES";

        if (s1 == s2){
            System.out.println("its equal");
        }
        String s3 = new String("YES");
        String s4 = new String("YES");
        if (s3.equals(s4)){
            System.out.println("its equal again");
        }
        String nameOfCourse = "TS";
        if(nameOfCourse.equals("TS")){
            System.out.println("You gonna be Tester after 6 months");
        }

        // Task !;
        // Check if string is equal to your name, print your surname

        String myName= "TUGBA";
        if(myName.equals("TUGBA")){
            System.out.println("Aydin");
        }
        // summary
       // in String use.equals
                // in number (int, double etc...) use ==
        // to check equality
    }
}
