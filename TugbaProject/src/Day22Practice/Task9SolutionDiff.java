package Day22Practice;

public class Task9SolutionDiff {

	public static void main(String[] args) {
		
	
		int arr[] = { 1,1000,34,66 };
        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;


        System.out.println("The given array is:" );
        
        for (int i = 0; i < arr.length; i++) {
        	
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
            	
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
            	
                secondLargest = arr[i];
	}
        }
        
        System.out.println("\nSecond largest number is:" + secondLargest);
}
}