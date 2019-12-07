package Day47;

public class Bat  implements Animal, AnimalThatFly{

	@Override
	public void fly() {
		System.out.println("Under the radar");
		
	}

	@Override
	public void eat() {
		System.out.println("Blood");
		
	}

}
