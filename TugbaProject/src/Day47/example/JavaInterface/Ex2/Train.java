package Day47.example.JavaInterface.Ex2;

public class Train implements Vehicle,AirVehicle,SeaVehicle{

	@Override
	public int speed() {
		
		return 100;
		
		
	}

	@Override
	public void swim() {
		System.out.println("It cannot swim");
		
	}

	@Override
	public void fly() {
		System.out.println("Are you crazy it cannot fly");
		
	}

}
