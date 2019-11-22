package Day32;


class Car{
	
	public static int count=0;
	
}
public class StaticField {

	public static void main(String[] args) {
		

		Car bmw= new Car();
		
		bmw.count++;
		
		System.out.println("Car count: "+bmw.count);
		
		Car passat= new Car();
		
		passat.count++;
		
		System.out.println("Car count of passat: "+ passat.count);
	}

}
