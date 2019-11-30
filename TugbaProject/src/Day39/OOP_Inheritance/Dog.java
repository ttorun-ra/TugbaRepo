package Day39.OOP_Inheritance;

public class Dog  extends Animal{


    public String sound = "bark";

    public Dog(String name, int age, String sound) {
    	
        super(name, age);
        
        this.sound = sound;
    }
//    inherit from animal and add sound bark
    
@Override
    
    public String toString() {
    	
        return "I want to return Dog ToString. here is my sound:" + sound;
    }
  
}