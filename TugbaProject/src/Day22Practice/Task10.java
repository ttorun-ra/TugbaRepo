package Day22Practice;

public class Task10 {

	public static void main(String[] args) {
	//	 10. Write a Java program to find the duplicate values of an array of integer values
		
		int [] num= {5,90,6,8,5,23,5,6,55};
		
		for(int i=0; i<num.length;i++) {
			
			for(int j=i+1;j<num.length; j++) {
				
			if(num[i]==num[j] && i!=j) {
				
				System.out.println("I already have that number: " + num[j]);
			}
			}
		}
	}
}
			
			
		
		
