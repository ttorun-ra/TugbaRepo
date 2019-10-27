package Day14;

public class myArrayMin {

	public static void main(String[] args) {
int myArray[]= {68,6,14,35,40,72};
//		
//		int min=myArray[0];
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<myArray.length;i++){
			if(myArray[i]<min) 
		

				min=myArray[i];
				
		}
	

		System.out.println(min);
	}

}


