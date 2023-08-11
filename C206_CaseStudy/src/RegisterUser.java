
public class RegisterUser {

	private String name;
	private String email;
	private String password;

	public RegisterUser(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	private String ProfileName;
	private String ProfileEmail;
	private String ProfilePassword;

	public void Profile(String ProfileName, String ProfileEmail, String ProfilePassword) {
		this.ProfileName = ProfileName;
		this.ProfileEmail = ProfileEmail;
		this.ProfilePassword = ProfilePassword;
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

	public String getProfileName() {
		return ProfileName;
	}

	public void setProfileName(String ProfileName) {
		this.ProfileName = ProfileName;
	}

	public String getProfileEmail() {
		return ProfileEmail;
	}

	public void setProfileEmail(String ProfileEmail) {
		this.ProfileEmail = ProfileEmail;
	}

	public String getProfilePassword() {
		return ProfilePassword;
	}

	public void setProfilePassword(String ProfilePassword) {
		this.ProfilePassword = ProfilePassword;
	}

	public String toString() {
		String output = "";
		output += "Name: " + getProfileName() + "Email: " + getProfileEmail() + "Password: " + getProfilePassword();

		return output;
	}

}
