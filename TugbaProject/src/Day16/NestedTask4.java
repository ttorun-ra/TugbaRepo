package Day16;

public class NestedTask4 {

	public static void main(String[] args) {
		//TODO Write program that prints this using loops
	    // *****
	    //  ****
	    //   ***
	    //    **
	    //     *
	  
	        System.out.println("HARD CODED -------------------------");
	        System.out.println("    *");
	        System.out.println("   **");
	        System.out.println("  ***");
	        System.out.println(" ****");
	        System.out.println("*****");

	        System.out.println("USING LOOPS ----------------------");
	        for (int i = 5; i >= 0; i--) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}
//for (int i = 0; i <= 5; i++) {
//    for (int j = 0; j <= 5; j++) {
//        if (j <= i) {
//            System.out.print("*");
//        } else {
//            System.out.print("$");
//        }
//    }
//    System.out.println();
//}
//}
//}
	