package Day22Practice;

public class Task7 {

	public static void main(String[] args) {
	//	7. Write a Java program to find the largest element in an array.
		
		int [] num= {5,90,6,8,23,55};
		
		int max=0;
		for(int i=0; i<num.length;i++) {
			
			
			if(num[i]>max) {
				max=num[i];
				
			}
		}
		
				System.out.println("The largest number is: "+ max);
		
	}
}
