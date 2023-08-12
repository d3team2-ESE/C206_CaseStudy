
public class RegisterUser {

	private String name;
	private String email;
	private String password;

	public RegisterUser(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void viewAllUsers() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	
}
