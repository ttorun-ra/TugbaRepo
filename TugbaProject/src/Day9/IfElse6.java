package Day9;

import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args) {
        //Evaluate result of exam
        // 'A'=> excellent
        //'B' = > good
        // 'C' => average
        // 'D' = > pass
        // 'F' = > fail
        
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your grade");
        
        String grade = scan.nextLine();
         if ("A".equals(grade)){
             System.out.println("excellent");
         }
         else if ("B".equals(grade) || "-B".equals(grade) || "+B".equals(grade)){
             System.out.println("good");
         }
         else if ("C".equals(grade) || "-C".equals(grade) || "+C".equals(grade)){
             System.out.println("average");
         }
         else if ("D".equals(grade) || "-D".equals(grade)|| "+D".equals(grade)){
             System.out.println("pass");
         }
         else{
             System.out.println("fail");
         }

         // Task 2
        // continue task 1 but also check fo +B and _B
        // ex;
        // B+,or B or B - => Good



    }
}
