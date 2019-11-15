package Day23Practice;

public class Task2 {

	public static void main(String[] args) {
		 // write a java program that find maximum
	    // of three numbers


		int a=6;
		int b=9;
		int c=16;
		
		if(a>b && a>c) {			
						
				System.out.println("the max is: "+ a);
				
			}else if(b>c &&b>a){
				System.out.println("the max is :"+ b);
				
			}else {
				System.out.println("the max is:"+c);
			}
		}
	}


