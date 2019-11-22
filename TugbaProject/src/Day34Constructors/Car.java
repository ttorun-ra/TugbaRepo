package Day34Constructors;

public class Car {
	
	int modelYear;
	String modelName;
	
	public Car(int year, String name) {
		
		modelYear=year;
		
		modelName=name;
		
		
	}

	public static void main(String[] args) {
		
		Car c1= new Car(2003,"Toyota Camry");
		
		System.out.println(c1.modelName+" "+c1.modelYear);
	}

}
