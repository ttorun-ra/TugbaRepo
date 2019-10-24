package Day9;

public class JawaSwitch {
    public static void main(String[] args) {
        String grade = "D-";

        switch (grade){
            case "A":
                System.out.println("excellent");
                break;
            case "B+":
            case "B":
            case"B-":
                System.out.println("good");

                break;
            case "C+":
            case "C":
            case"C-":
                System.out.println("Average");
                break;
            case"D+":
            case "D":
            case"D-":
                System.out.println("Pass");
                break;
            case "F":
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid grade");
                break;


        }
    }

}
