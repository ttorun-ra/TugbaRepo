package MyClasses;

public class Calling {

	public static void main(String[] args) {
		
		Cars araba= new Cars();
		
		araba.color="Blue";
		
		araba.price=5500;
		
		araba.brand="toyota";
		
		int fiyat=araba.CarPrice(55,60);
		
		System.out.println(fiyat);
		
//		String renk=araba.CarColor("blue");
		
		System.out.println(araba.color);

	}

}
