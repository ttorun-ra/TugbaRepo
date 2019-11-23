package Day37.example.objects;



public class Car {
	
	
	public String brand;
	public  String year;
	public Person person;
	

	public Car(String brand, String year,String name, String age) {
		
		this.brand=brand;
		this.year=year;
		
		 person=new Person();
		
		person.age=age;
		person.name=name;
		
	}public String toString() {
		
		return "Brand: "+ brand+" "+
				"Year: "+year+" "+
				"name: "+person.name+" "+person.age;
				    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method s

	}

}
