package Day47.example.JavaInterface.Ex2;

public class Plain implements Vehicle,AirVehicle,SeaVehicle{

	@Override
	public int speed() {
	return 800;
		
	}

	@Override
	public void swim() {
	System.out.println("Cannot swim");
		
	}

	@Override
	public void fly() {
		System.out.println("Enjoy your flight");
		
	}

}
