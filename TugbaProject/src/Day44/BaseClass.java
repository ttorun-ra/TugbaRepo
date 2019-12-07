package Day44;
//you have to create Derived class that inherits from BaseClass
//your BaseClass has to have abstract void method
//Your DerivedClass has to have method called study()
//when you run the Main method, you have run the study method.
	
public abstract class BaseClass {
	
	 public abstract void study();
	 
	  public static void main(String[] args) {
		  
	    	BaseClass d= new DerivedClass();
	    	d.study();
	    }	 	
}
class DerivedClass extends BaseClass{
	@Override
    public void study() {
        System.out.println("We have a fun class today");
    }
}
