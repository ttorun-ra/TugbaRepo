package Day39.OOP_Inheritance;

class Data{
	
	public Data() {
		System.out.println("A");
	}
}
public final class bi extends Data{
	
	public bi() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		
		bi obj=new bi();
		}
	}


