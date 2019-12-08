package Day48RecapOOP;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	  public static void main(String[] args) {
	        Zoo zoo = new Zoo();
	        
	        List<Animal> animals = zoo.populateList();

	        // print sounds
	        printAnimalSounds( animals );

	        // instanceof
	        checkForSpecialAnimalFish( animals );
	        
	        Food tigerFood = new Food( "Deers", 10.90, 700 );
	        
	        Food lionFood = new Food( "Zebra", 7.00, 200 );
	        
	        Food giraffeFood = new Food( "Leaves", 5.99, 900 );


	        Tiger t=new Tiger();
	        t.feed(tigerFood);
	        t.setMaxCal(1000);
	        t.setMinCal(700);
	        
	        Lion l=new Lion();
	        l.setMaxCal(1500);
	        l.setMinCal(1000);
	        l.feed(lionFood);
	        
	        Giraffe g=new Giraffe();
	        g.feed(giraffeFood);
	       g.setMaxCal(800);
	       g.setMinCal(600);

	    }

	    private static void checkForSpecialAnimalFish(List<Animal> animals) {
	        for(Animal animal : animals) {
	            if(animal instanceof Giraffe){
	                System.out.println("I've special animal in my Zoo");
	            }
	        }
	        System.out.println("----------------------");
	    }

	    private static void printAnimalSounds(List<Animal> animals) {
	        for(Animal animal : animals) {
	            animal.sound();
	        }
	        System.out.println("----------------------");
	    }

	    private List<Animal> populateList() {
	        List<Animal> animals = new ArrayList<>();
	        for(int i = 0; i < 5; i++) {
	            animals.add( new Tiger() );
	        }

	        for(int i = 0; i < 4; i++) {
	            animals.add( new Lion() );
	        }
	        animals.add( new Giraffe() );

	        return animals;
	    }
	}
	
