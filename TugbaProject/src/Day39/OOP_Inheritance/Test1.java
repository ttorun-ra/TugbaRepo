package Day39.OOP_Inheritance;

public class Test1 {

	public static void main(String[] args) {
		Child  c=new Child();
		
		c.myMethod();
		
		c.display();
		
		
		
		Parent p= new Child();
		
		p.myMethod();
		
		p.display();
		
		p.play();
		
		c.play();

	}

}
