package Day47;

public class Ex1 {

	public static void main(String[] args) {
		
	Dog d =new Dog();
	d.cuteness();
	
	d.sound();

	AbstractAnimal c=new Cat();
	c.cuteness();
	c.sound();
	AbstractAnimal d2=new Dog();
	
	d2.cuteness();
	d2.sound();
	
	}

}
