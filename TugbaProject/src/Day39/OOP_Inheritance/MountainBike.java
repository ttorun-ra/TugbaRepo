package Day39.OOP_Inheritance;

public class MountainBike  extends Bicycle{
	
	public int height;

	public MountainBike(int gear, int speed, int height) {
		
		super(gear, speed);
		
		this.height=height;
		
	}

}
