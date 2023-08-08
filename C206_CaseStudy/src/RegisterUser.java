
public class RegisterUser {

	//
		  private String name;
		  private String email;
		  private String password;
		  private String userid;
		  private int contactnum;
		  private String dob;
		  private String gender;
		  
		  public RegisterUser(String name, String email, String password, String userid, int contactnum, String dob, String gender) {
		    super();
		    this.name = name;
		    this.email = email;
		    this.password = password;
		    this.userid = userid;
		    this.contactnum = contactnum;
		    this.dob = dob;
		    this.gender = gender;
		    
		  }
		  
		  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }

		  public String getEmail() {
		    return email;
		  }
		  public void setEmail(String email) {
		    this.email = email;
		  }
		  public String getPassword() {
		    return password;
		  }
		  public void setPassword(String password) {
		    this.password = password;
		  }
		  public String getUserid() {
		    return userid;
		  }
		  public void setUserid(String userid) {
		    this.userid = userid;
		  }
		  public int getContactnum() {
		    return contactnum;
		  }
		  public void setContactnum(int contactnum) {
		    this.contactnum = contactnum;
		  }

		  public String getDob() {
		    return dob;
		  }
		  public void setDob(String dob) {
		    this.dob = dob;
		  }
		  public String getGender() {
		    return gender;
		  }

		  public void setGender(String gender) {
		    this.gender = gender;
		  }
		  
		}

