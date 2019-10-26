package Day16;

public class ArraysMax {

	public static void main(String[] args) {
		
		int myArray[]= {68,6,14,35,40,72};
		
		int max=myArray[0];
		
		for(int i=0;i<myArray.length;i++){
			if(myArray[i]>max) 
		

				max=myArray[i];
				
		}
	

		System.out.println(max);
	}

}
