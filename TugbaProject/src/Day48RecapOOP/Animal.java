package Day48RecapOOP;

public interface Animal {
	void sound();

	void feed(Food food);
	
}

class Tiger extends AnimalBase implements Animal {
	
}
	private String breed;
	private double minCal;
	private double maxCal;

	public Tiger() {
		
	}
	
	public Tiger(String breed, double minCal,double maxCal) {
		
	}
	@Override
	public void sound() {
		System.out.println("Rooaar");
	}

	@Override
	public void feed(Food food) {
		
		
		if(food.getCal()<minCal) {
			
		
			System.out.println("Stuill hungry");
			
	} else if(food.getCal() > maxCal) {
	            System.out.println( "Over eating, fat dog" );
	        } else {
	            System.out.println( "Healthy dog, good boy" );
	        }
}

   class Lion extends AnimalBase implements Animal {
public Lion() {
		
	}
	
	public Lion(String breed, double minCal,double maxCal) {
		setMinCal(minCal);
        setMaxCal(maxCal);
	}
	
	@Override
	public void sound() {
		System.out.println("It has the same sound with Tiger");
	}

	@Override
	public void feed(Food food) {
		
		System.out.println(food.getName()+" "+ food.getCal());
		
		
			
		}

	}
}

class Giraffe extends AnimalBase implements Animal {
	
public Giraffe() {
		
	}
	
	public Giraffe(String breed, double minCal,double maxCal) {
		
	}
	@Override
	public void sound() {
		System.out.println("I don't know how it sounds");

	}

	@Override
	public void feed(Food food) {
		System.out.println(food.getName());

	}

}