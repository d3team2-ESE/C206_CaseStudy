
public class JobApplication {
	
	    private String name;
	    private String position;
	    private String status;

	    public JobApplication(String name, String position, String status) {
	        this.name = name;
	        this.position = position;
	        this.status = status;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPosition() {
	        return position;
	    }

	    public void setPosition(String position) {
	        this.position = position;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }
}
