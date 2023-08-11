
//
public class JobProfile {
	 
    private String jobTitle;
    private String company;
    private String description;
    private double salary;

    public JobProfile(String jobTitle, String company, String description, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.description = description;
        this.salary = salary;
    }

    public void displayJobProfile() {
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + company);
        System.out.println("Description: " + description);
        System.out.println("Salary: $" + salary);
    }
}