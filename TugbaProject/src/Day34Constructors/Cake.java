package Day34Constructors;

public class Cake {
	
	//  2 attributes
	// int fruits
	// string color
	
	
	int fruits;
	String colors;
	
	public Cake(int fruit, String color) {
		fruits=fruit;
		colors=color;
		
		
	}

	public static void main(String[] args) {
		
		Cake ch= new Cake(5,"black");
		
		System.out.println(ch.fruits+" "+ ch.colors);
	

	}

}
