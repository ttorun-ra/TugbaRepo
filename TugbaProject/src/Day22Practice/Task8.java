package Day22Practice;

public class Task8 {

	public static void main(String[] args) {
	//	8. Write a Java program to find the smallest element in an array.

		
       int [] num= {5,90,6,8,23,55};
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<num.length;i++) {
			
			
			if(num[i]<min) {
				min=num[i];
				
			}
		}
		
				System.out.println("The smallest number is: "+ min);
		
	}


	}


