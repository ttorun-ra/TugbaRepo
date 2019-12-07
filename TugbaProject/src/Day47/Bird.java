package Day47;

public class Bird implements Animal, AnimalThatFly {

	@Override
	public void eat() {
		System.out.println("Birds eat seeds");

	}

	@Override
	public void fly() {

		System.out.println("Flying high");

	}

}
