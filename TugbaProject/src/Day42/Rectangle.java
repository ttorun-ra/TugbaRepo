package Day42;

public class Rectangle extends Shape {

	  private double width;
	    private double length;

	    public Rectangle(String color, boolean filled, double width, double length) {
	        setColor(color);
	        setFilled(filled);

	        this.width = width;
	        this.length = length;
	    }
	}
//public Rectangle(String name, int corners, String color, boolean filled) {
//    super(name, corners, color, filled);
//}
//
//public static void main(String[] args) {
//    Rectangle r1 = new Rectangle("rec1", 4, "black", true);
//    System.out.println(r1.toString());
//
//    Rectangle r2 = new Rectangle("rec2", 4, "purple", false);
//    System.out.println(r2.toString());
//}
//}