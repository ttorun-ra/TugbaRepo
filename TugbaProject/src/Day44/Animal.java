package Day44;

class TestAbstractConcept {
	
    public static void main(String[] args) {
    	
    	// Abstract class is a restricted class
    	// that cannot be used to create objects
    	// to access it, it must be inherited from the other class
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}

// the abstract keyword is a non access modifier, used for classes and methods
public abstract class Animal {
	
	// Abstract method can only be used in an abstract class,
	// and it doesn't have a body
	// the body is provided by the subclass(inherited from)
    public abstract void makeSound();
    // and can have a regular method
    public void sleep() {
    	
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark bark...");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow..");
    }
}