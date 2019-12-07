package Day47;

public class Task1 {

	public static void main(String[] args) {
	
		AbstractLogin a= new AdminLogin();
		
		a.testLogin();
		
		a.testPassword();
		
		AbstractLogin m= new ManagerLogin();
		
		m.testLogin();
		
		m.testPassword();
		
		AbstractLogin u= new UserLogin();
		
		u.testLogin();
		
		u.testPassword();
	}

}
