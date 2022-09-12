package loginandreg;

public class loginbean {	
	


	
	private String Username, password, email, phone;

	
	public loginbean() {
		super();
	}

	public loginbean(String Username, String password, String email, String phone) {
		super();
		this.Username = Username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}

	

