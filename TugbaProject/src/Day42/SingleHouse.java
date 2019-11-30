package Day42;

public class SingleHouse extends House {

	public boolean backyard;
	public int floors;

	public SingleHouse() {
		
		this(false, 2,3,40.00);
	}

	public SingleHouse(boolean by, int f,int rooms, double price) {
		super(rooms, price);
		backyard = by;
		floors = f;

	}

	public String partyDate() {
		super.isNew();// this returns true cuz parent class method

		isNew(); // this returns false cuz overriding method in subclass

		return "01/10/19";

	}

	@override
	public boolean isNew() {

		return false;
	}

}
