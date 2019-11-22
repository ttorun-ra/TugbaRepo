package Day32;

public class R2 {

	public static void main(String[] args) {
		
		Rectangle r= new Rectangle();
		
		r.length=5;
		
		r.width=4;

	int perimeter= r.getPerimeter(5,4);
	
	int area=r.getArea(5, 4);
	
	System.out.println("the perimeter is:  :"+perimeter);
	
	System.out.println("the area is:  :"+area);
}
}

