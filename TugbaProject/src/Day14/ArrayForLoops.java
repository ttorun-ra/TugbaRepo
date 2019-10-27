package Day14;

public class ArrayForLoops {

	public static void main(String[] args) {
		
		
		int [] arr1 = {2,11,45,9};
		
		int [] arr2=new int[4];
		
		arr2[0]= 2;
		arr2[1]=11;
		arr2[2]=45;
		arr2[3]=9;
		
		
		for (int num:arr1) {
			System.out.println(num);
		}

		System.out.println();
		
		for(int i=0; i<arr1.length;i++) {
			
			System.out.println("arr1 : " + arr1[i]);
			System.out.println("arr2  : "+ arr2[i]);
	}
		
		

		System.out.println("---------------");
		
		String[] words= {"name","Age","Laptop"};
		
		for(String w:words) {
			System.out.println(w);
		}
		
		char[]chars= {'A','B','C','D','E'};
		
		for(char c: chars) {
			System.out.println(c);
		}
}
}
