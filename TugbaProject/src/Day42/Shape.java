package Day42;

// create base class Shape add attributes
// create two subclass as Circle and Rectangle
public class Shape {

	public String name;
	public int corners;
	public int length;
	public int width;
	private String color;
	private boolean filled;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public boolean isFilled() {
		
		return filled;
	}

	public void setFilled(boolean filled) {
		
		this.filled = filled;
	}
}

//
//	
//
//	public Shape(String color, boolean filled) {
//		
//		this.color="yellow";
//		
//		this.filled=true;
//		
//	}		
//	    public String toString () {
//	        return "Name of shape: " + name + "\n"
//	                + "Corner number: " + corners + "\n"
//	                + "Color: " + color + "\n"
//	                + "It's filled: " + filled;
//	        
//	    }
//	}
//
//	