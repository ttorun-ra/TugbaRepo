package MyClasses;


class car{
	
	public static int a=4;
	
	public static String doors="good";
	
	public static  char d='c';
	
	
}

 public class PracticeStatic {

		public static void main(String[] args) {
			
			 car obj=new car();
			 
			 System.out.println(obj.a);
			 
			 car obj1=new car();
			 System.out.println(obj1.a);
			 
			 int b=obj.a;
			 System.out.println(b);
			 
			 String kapi=obj.doors;
			 System.out.println(kapi);
			 char d=obj.d;
			 System.out.println(d);

 

	
	
	
		
		
		 
		 
		

	}

}
