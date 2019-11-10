package Day22Practice;

public class Task18 {

	public static void main(String[] args) {
		//write a java program that iterates in reverse order on
	    // an array using while-loop

		
		int arr[] = {1,2,3,4,5};
		
		int i=arr.length-1;
		int c=0;
		while(i>=0) {
			System.out.println(arr[i]+ " " + arr[c]);
			i--;
		}

	}

}
