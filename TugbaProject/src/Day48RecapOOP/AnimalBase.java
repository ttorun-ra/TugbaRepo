package Day48RecapOOP;

public abstract class AnimalBase {
	private String name;
	
	private double minCal;
	private double maxCal;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMinCal() {
		return minCal;
	}

	public void setMinCal(double minCal) {
		this.minCal = minCal;
	}

	public double getMaxCal() {
		return maxCal;
	}

	public void setMaxCal(double maxCal ) {
		this.maxCal =maxCal ;
	}

}
