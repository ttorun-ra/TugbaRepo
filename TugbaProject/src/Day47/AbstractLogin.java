package Day47;
// Create abstract class AbstractLogin
// add abstract method: testLogin
// create 3 subclasses as AdminLogin, ManagerLogin, UserLogin
// and implement method testLogin

public abstract class AbstractLogin {
	
	public abstract void testLogin();
	public abstract void testPassword();
		
	}


class AdminLogin extends AbstractLogin{

	@Override
	public void testLogin() {
		System.out.println("Enter your admin infromation");
		
	}

	@Override
	public void testPassword() {
		System.out.println("It is a valid admin password");
		
	}	
}

class ManagerLogin extends AbstractLogin{

	@Override
	public void testLogin() {
		System.out.println("Enter your manager information");
			
	}

	@Override
	public void testPassword() {
		System.out.println("It is a valid manager password");
		
	}	
}
class UserLogin extends AbstractLogin{

	@Override
	public void testLogin() {
		System.out.println("Enter your user information");
	}

	@Override
	public void testPassword() {
		System.out.println("It is a valid user password");
		
	}
				
	}