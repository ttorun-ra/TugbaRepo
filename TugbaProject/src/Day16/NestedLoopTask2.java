package Day16;

public class NestedLoopTask2 {

	public static void main(String[] args) {
	// using loop print mutlipication table of 1
		
//		for(int i =0; i<=10;i++) {
//			
//			String leftPart="1" + "x" +i;
//			
//			String rightPart="="+ (i*1);
//			
//			System.out.println(leftPart + rightPart);
			
//			for(int j=1;j<=1;j++) {
//				
//				
//				System.out.println(j*i ); 
//			}
//		}
//
//	}


for(int a=1;a<=10;a++) {
	
	for(int b=0;b<=10;b++) {
		System.out.println(a+"*" +b +"=" + a*b);
	}
	System.out.println("-------------------");
}
}
	}
