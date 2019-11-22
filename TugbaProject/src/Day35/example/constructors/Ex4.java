package Day35.example.constructors;


class Food{
	public String name;
	public Food() {
		System.out.println("Default constructor");
	}
	public Food(String n) {
		System.out.println("Constructor with parameter");
		name=n;
		
	}public String print() {
		return name;
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Food f=new Food();
		f.name="Tiramisu";
		System.out.println(f.name);
		System.out.println(f.print());
		System.out.println("-----------");
		
		Food cake=new Food("cake");
		System.out.println(cake.name);
		System.out.println(cake.print());

	}

}
