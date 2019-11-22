package Day32;

public class JavaClass {

	public static void main(String[] args) {
		
		Animal tiger=new Animal();
		
		tiger.legs=4;
		
		tiger.age=5;
		
		tiger.weight=200.10;
		
		tiger.name="Richard Parker";
		
		tiger.poisonous=false;
		
		tiger.breed="Bangal";
		
		tiger.cuteness();
		
		int speed=tiger.getSpeed();

		System.out.println("Speed of tgier :"+speed);
		System.out.println("Can my tiger jump?:"+tiger.canJump());
		
		String output=tiger.toString();
		
		System.out.println("-------------");
		System.out.println(output);
		
		Animal dog= new Animal();
		
		dog.age=7;
		dog.legs=4;
		dog.name="Dog";
		dog.poisonous=false;
		dog.cuteness();
		
		int speed1=dog.getSpeed();
		System.out.println("My speed is: "+speed1);
		
		System.out.println("Can it jump:"+dog.canJump());
	}
	
	}
	

