package MyClasses;

public class OfficeHour12_StaticMain {

	public static void main(String[] args) {
		
//		
//		AliOfficeHour obj1=new AliOfficeHour();
//		
//		obj1.method1();
//		
//		AliOfficeHour .methodStatic();
//		
//		AliOfficeHour obj2=new AliOfficeHour();
//		
//		obj2.method1();

		
		
		OfficeHourMethods o1=new OfficeHourMethods();
		int myRandom=o1.randomNum();
		
		System.out.println("My Random Number "+myRandom);
		
		String anyName=o1.Name("Bayram");
		
		System.out.println(anyName);
		
	}

}
