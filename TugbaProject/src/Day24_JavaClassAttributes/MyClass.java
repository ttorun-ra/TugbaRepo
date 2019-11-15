package Day24_JavaClassAttributes;

public class MyClass {
//	
////	
////	int y=6;
////	int z;
////
////	 int x=90;
//	public static void main(String[] args) {
		

//		MyClass obj=new MyClass();
//		MyClass obj2= new MyClass();
//	
//		obj2.x=34;
//		obj.y=56;
//		obj.z=8;
//		System.out.println(obj.x);
//		System.out.println(obj.y);
//		System.out.println(obj.z);
//		System.out.println(obj2.x);
//		System.out.println(obj.x);
		
//		int n=5;
//		int result=1;
//		while(n!=0){
//			
//			result=result*(n);
//			n--;
//			
//			
//			
//		}
//		System.out.println(result);
		
		
		
			   //Static integer variable
			   static int var1=77; 
			   //non-static string variable
			   String var2;

			   public static void main(String args[])
			   {
				MyClass ob1 = new MyClass();
				MyClass ob2 = new MyClass();
				/* static variables can be accessed directly without
				 * any instances. Just to demonstrate that static variables
				 * are shared, I am accessing them using objects so that 
				 * we can check that the changes made to static variables
				 * by one object, reflects when we access them using other
				 * objects
				 */
			        //Assigning the value to static variable using object ob1
				ob1.var1=88;
				ob1.var2="I'm Object1";
			        /* This will overwrite the value of var1 because var1 has a single 
			         * copy shared among both the objects.
			         */
			        ob2.var1=99;
				ob2.var2="I'm Object2";
				System.out.println("ob1 integer:"+ob1.var1);
				System.out.println("ob1 String:"+ob1.var2);
				System.out.println("ob2 integer:"+ob2.var1);
				System.out.println("ob2 STring:"+ob2.var2);
			   }
			}

	
