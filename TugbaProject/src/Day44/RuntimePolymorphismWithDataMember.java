package Day44;

public class RuntimePolymorphismWithDataMember {
// you canNOT override data members
	
	public static void main(String[] args) {
		Bike obj = new Honda();

        System.out.println(obj.speedlimit);//90
        
        // here method overriding works on method
        
        obj.Print();
    }
}

class Bike {
    int speedlimit = 90;
    void Print(){
        System.out.println("Bike driving");
    }
}

class Honda extends Bike {
    int speedlimit = 150;
    void Print(){
        System.out.println("Honda driving");
    }
}