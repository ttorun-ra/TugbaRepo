package Day42;

public class House {
	public  int doors;
	public int rooms;
	
	public double price;
	
	
	public House( int rooms, double price) {
		
		this.doors = doors;
		this.rooms = rooms;
		
		this.price = price;
	}


	public boolean isNew() {
		return true;
	}
	@override
	
	public String toString() {
		
		return "House";
	}


}
