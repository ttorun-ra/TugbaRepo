package Day16;

public class task {

	public static void main(String[] args) {
		 for (int i=1; i<=3; i++)
	        {
	            // Print space in decreasing order
	            for (int j=3; j>i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in increasing order
	            for (int k=1; k<=(i * 2) -1; k++)
	            {
	                if( k == 1 || k == (i * 2) -1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	        for (int i=3-1; i>=1; i--)
	        {
	         // Print space in increasing order
	            for (int j=3-1; j>=i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in decreasing order
	            for (int k=1; k<=(i * 2) -1; k++)
	            {
	                if( k == 1 || k == (i * 2) -1 )
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
}
	}
}


