package Day47;

public class Cat extends AbstractAnimal{
	
	@Override
	public void sound() {
		
		System.out.println("Meow");
		
		Cat c=new Cat();
		c.name="CAT";
		c.jump();
		
	}

	@Override
	public void cuteness() {
		System.out.println("They are cute");
		
	}
	
}
