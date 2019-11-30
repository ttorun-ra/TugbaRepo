package Day42;

public class EncapsulationEx {
//read only-accessible to get/read attributes/field
	// write only modify attributes/field, cannot read

	public static void main(String []a) {

		Car car = new Car("Ford");

//		String n= ford.getName();
		
//		car.setName("Toyota");
//
//		System.out.println(car);
		
		car.setPassword("123123");

	}
}
