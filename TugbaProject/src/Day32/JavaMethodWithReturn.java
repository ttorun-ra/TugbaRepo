package Day32;

public class JavaMethodWithReturn {

	public static void main(String[] args) {
		
//
//		String a=printTechno();
//		System.out.println(a.charAt(0));
//		System.out.println("Study");
		
		int sum=sumOfThree(10,20,30);
		
		double average=avg(sum,3);
		
		System.out.println(sum);
		
		System.out.println(average);
	}

	public static String printTechno() {
		
		
		return  "Techno";
	}
	public static double avg(int sum, int size) {
		
	double average=(double) sum/size;
	
		return average;
	}
	public static int sumOfThree(int a, int b, int c) {
		
		int sum=a+b+c;
		
		return sum;
	}
}
