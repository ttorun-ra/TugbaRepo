package Day37.example.objects;


//create a class which will have 3 attributes
//all attributes should be also classes!!!
//in every class you need to have at least 2 attributes


class Fruits{
	
	public String name;
	public String weight;
	public boolean taste;
	
} 
class Vehicle{
	
	public String brand;
	public String year;
	
}
class School{
	public String director;
	public String topic;
	
}

class AllInfo{
	
	public Fruits fruit;
	public Vehicle vehicle;
	public School school;
	
	
	
      public AllInfo(String name,String weight,String brand, String year,String director,String topic) {
    	  
    	  fruit.name=name;
    	  fruit.weight=weight;
    	  vehicle.brand=brand;
    	  vehicle.year=year;
    	  school.director=director;
    	  school.topic=topic;
      
      } public String toString() {
		
		return "Fruit: " + fruit.name+" "+fruit.weight+
				"Car: "+ vehicle.brand+" "+ " "+vehicle.year+
				"School: "+ school.director+" "+ school.topic;
	
		
	}
}

public class Task2 {

		
	public static void main(String[] args) {
		
		
		AllInfo info=new AllInfo("Apple","3","Passat","2005","Bergen","Math");
		
		System.out.println(info.toString());

	}

}
