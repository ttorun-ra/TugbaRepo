package Day48RecapOOP;

public class Food {
	//part4
	// create class Food
	// add attributes and encapsulate it
	
	private String name;

	private double price;
	
	private double cal;
	
	  public Food(String name, double price, double cal) {
	        this.name = name;
	        this.price = price;
	        this.cal = cal;
	    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCal() {
		return cal;
	}

	public void setCal(double cal) {
		this.cal = cal;
	}	
}