package Day19_HashSet;

public class fibWithArrays {

	public static void main(String[] args) {
		int [] nums= new int [100];
		
		// fib(n)= fib(n-2) + fib (n-1);
		
		nums[0] = 0;
		nums [1]=1;
		nums[2]=1;
		nums[3]= nums[1]+ nums[2];
		 for (int i=3; i<nums.length;i++) {
			 
			 nums[i]= nums[i-2]+ nums[i-1];
			 
		 }

		 for(int num:nums) {
			 System.out.print(num + " ");
		 }
	}

}
