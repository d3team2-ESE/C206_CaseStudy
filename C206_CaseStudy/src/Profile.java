////
public class Profile {
	  

	  private String ProfileName;
	  private String ProfileEmail;
	  private String ProfilePassword;
	  
	  public Profile(String ProfileName, String ProfileEmail, String ProfilePassword) {
	    this.ProfileName = ProfileName;
	    this.ProfileEmail = ProfileEmail;
	    this.ProfilePassword = ProfilePassword;
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
	     output += "Name: " + getProfileName() + "Email: " +getProfileEmail() + "Password: "+getProfilePassword();
	    
	     return output;
	  }
	  
	}