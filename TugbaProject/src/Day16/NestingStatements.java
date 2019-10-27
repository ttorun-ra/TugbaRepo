package Day16;

public class NestingStatements {

	public static void main(String[] args) {
		
		 //nested if
	    //nested loop
	    // 1. write program that prints this using loops
	    //    *
	    //    **
	    //    ***
	    //    ****
	    //    *****
	    // 2. write program that prints this figures using loops
	    //        *
	    //       **
	    //      ***
	    //     ****
	    //    *****
	    //      *
	    //     * *
	    //    *   *
	    //     * *
	    //      *
	    // 3. Make interactive calculator ¯\
////		
//		for(int i=0;i<=5;i++) {
//			
//			for(int j=0;j<=i;j++) {
//				
//			System.out.print("*");
//			}
//			System.out.println();
////		}
//
//	}
//	}
//}
		
		
		for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}

