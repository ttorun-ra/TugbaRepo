package Day42;

public class Login {
	
    private String Username;
    private String password;
    private int confirmationCode;
    
    public int getConfirmationCode() {
    	
		return confirmationCode;
	}

	public void setConfirmationCode(int confirmationCode) {
		
		this.confirmationCode = confirmationCode;
	}

	public String getSecurityQuestions() {
		
		return securityQuestions;
	}

	public void setSecurityQuestions(String securityQuestions) {
		
		this.securityQuestions = securityQuestions;
	}

	private String securityQuestions;


    public String getUsername() {
    	
        return Username;
    }

    public void setUsername(String username) {
    	
        Username = username;
    }

    public String getPassword() {
    	
        return password;
    }

    public void setPassword(String password) {
    	
        this.password = password;
    }
}