package Day15;


public class HwOctober26thArrays2 {

	public static void main(String[] args) {
		 // 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
	    //    with a 2 somewhere later in the array.
		
		int[]a= {2,5,1,6,8,9};
		
		for (int i =0;i<a.length;i++) {
			if(a[i]==1 || a[i]==2) {
			
			

				
				System.out.println("it has 1 and 2");
			}
		}

	}
}
