package Day22Practice;

public class Task11 {

	public static void main(String[] args) {
		
		// 11. Write a Java program to find the duplicate values of an array of string values.
		String[] s= { "Tugba","Zeynep","Sena","Sena","Hacer","Zeynep"};
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=i+1; j<s.length;j++) {
				
				if(s[i].contentEquals(s[j])&& i!=j) {
					
					System.out.println("I already have the name: "+ s[j]);
				}
			}
			
		}

	}

}
