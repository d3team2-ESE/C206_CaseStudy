import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//
public class C206_CaseStudy {
    public static void main(String[] args) {
        ArrayList<RegisterUser> userList = new ArrayList<>();
        
        userList.add(new RegisterUser("John", "john@email.com", "passwordjohn"));
        userList.add(new RegisterUser("Jane", "jane@email.com", "passwordjane"));
        
        int option = -1;
        while (option != 3) {
            displayPublicMenu();
            option = Helper.readInt("\nEnter option or 0 to display public menu > ");
            
            if (option == 1) {
                userMenu(userList);
            } else if (option == 2) {
                adminMenu(userList);
            }
        }
    }
    
    private static void displayPublicMenu() {
        System.out.println("\n************ Career Planning Application ************");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
    }
    
    private static void userMenu(ArrayList<RegisterUser> userList) {
        int userOption = -1;
        
        while (userOption != 3) {
            System.out.println("\n************ User Menu ************");
            System.out.println("1. Add User");
            System.out.println("2. Existing User");
            System.out.println("3. Exit");
            
            userOption = Helper.readInt("\nEnter option or 0 to display user menu > ");
            
            if (userOption == 1) {
                addUser(userList);
                System.out.println("User added");
            } else if (userOption == 2) {
                
                // Implement existing user functionality
            }
        }
    }
    
    private static void addUser(ArrayList<RegisterUser> userList) {
        String name = Helper.readString("Enter name: ");
        String email = Helper.readString("Enter email: ");
        String password = Helper.readString("Enter password: ");
        
        RegisterUser newUser = new RegisterUser(name, email, password);
        userList.add(newUser);
    }
    
    private static void adminMenu(ArrayList<RegisterUser> userList) {
        int adminOption = -1;
        
        while (adminOption != 10) {
            System.out.println("\n************ Admin Menu ************");
            System.out.println("1. Add User");
            System.out.println("2. View All Users");
            System.out.println("3. Delete User");
            System.out.println("4. Add Course");
            System.out.println("5. View All Courses");
            System.out.println("6. Delete Course");
            System.out.println("7. Add Job Profile");
            System.out.println("8. View All Job Profiles");
            System.out.println("9. Delete Job Profile");
            System.out.println("");
            System.out.println("10. Logout");
            
            adminOption = Helper.readInt("\nEnter option or 0 to display admin menu > ");
            
            if (adminOption == 1) {
                addUser(userList);
                System.out.println("User added");
            } else if (adminOption == 2) {
                viewAllUsers(userList);
            } else if (adminOption == 3) {
                deleteUser(userList);
            } else if (adminOption == 4) {
                addCourse();
            } else if (adminOption == 5) {
                viewAllCourses();
            } else if (adminOption == 6) {
                deleteCourse();
            } else if (adminOption == 7) {
                addJobProfile();
            } else if (adminOption == 8) {
                viewAllJobProfiles();
            } else if (adminOption == 9) {
                deleteJobProfile();
            }else if (adminOption == 13) {
            	addJobApplication();
            }else if(adminOption == 14) {
            	viewJobApplication();
            }else if(adminOption == 15) {
            	deleteJobApplication();
            }
        }
    }

	


	private static boolean deleteUser(ArrayList<RegisterUser> userList) {
		
		Helper.line(50, "-");
		System.out.println("DELETE USER");
		Helper.line(50, "=");

		boolean userfound = false;
		char confirmdelete = 'n';// set delete to no

		String user = Helper.readString("Enter name > ");
		Helper.line(50, "=");

		for (int i = 0; i < userList.size(); i++) {// for loop for user array list
			if ((userList.get(i).getName()).equalsIgnoreCase(user)) {// ignore case and same
				userfound = true;// inside
				userList.get(i).viewAllUsers();// display
				Helper.line(50, "=");
				confirmdelete = Helper.readChar("\nConfirm deletion(y/n) > ");// prompt user
				if (confirmdelete != 'n') {// confirm delete
					userList.remove(i);// remove
					System.out.println("\n*** User has been deleted ***");
				}

			}

		}

		return userfound;
	}
	

	private static void viewAllUsers(ArrayList<RegisterUser> userList) {
		Helper.line(50, "-");
		System.out.println("VIEW ALL USER");
		Helper.line(50, "=");

		for (int i = 0; i < userList.size(); i++) {
			userList.get(i).viewAllUsers();
		}
	}
	
	
public static void viewAllCourses() {
	List<Course> courses = new ArrayList<>();
		System.out.println("All Courses:");
			Course.viewAllCourses(courses);
	    }
	

public static void  addCourse() {
	
	List<Course> courses = new ArrayList<>();
	for (Course course : courses) {
    	System.out.println("Course: " + course.getTitle());
		System.out.println("Description: " + course.getDescription());
		System.out.println("Duration: " + course.getDuration());
		System.out.println("Target Audience: " + course.getTargetAudience());
		System.out.println("Price: $" + course.getPrice());
		System.out.println("Teacher: " + course.getTeacher());
		System.out.println();
    }
}


 public static void main1(String[] args) {
        String courseNameToDelete = Helper.readString("Course title to delete> ");

        boolean courseDeleted = deleteCourse(courses, courseNameToDelete);

        if (courseDeleted) {
            System.out.println("Course \"" + courseNameToDelete + "\" deleted.");
        } else {
            System.out.println("Course \"" + courseNameToDelete + "\" not found.");
        }
    }

 public static boolean deleteCourse() {
	 List<Course> courses = new ArrayList<>();
	 String courseNameToDelete = Helper.readString("Course title to delete> ");


     boolean courseDeleted = Course.deleteCourse(courses);

     if (courseDeleted) {
         System.out.println("Course \"" + courseNameToDelete + "\" deleted.");
     } else {
         System.out.println("Course \"" + courseNameToDelete + "\" not found.");
     }
 }

public static void viewAllJobProfiles(){
    

        JobProfile jobProfile1 = new JobProfile("Criminal Lawyer", "Lee & Brothers", "Represents defendants and organizations with criminal charges.", 80000.0);
        JobProfile jobProfile2 = new JobProfile("Data Analyst", "DataCo", "Analyzing and interpreting data.", 60000.0);

        System.out.println("Viewing Job Profile 1:");
        jobProfile1.displayJobProfile();

        System.out.println("\nViewing Job Profile 2:");
        jobProfile2.displayJobProfile();
}
        
  public static void addJobProfile(){
        String jobTitle = "Criminal Lawyer";
        String company = "Lee & Brothers";
        String description = "Represents defendants and organizations with criminal charges.";
        double salary = 80000.0;

        JobProfile jobProfile = new JobProfile(jobTitle, company, description, salary);

        System.out.println("Job Profile Created:");
        jobProfile.displayJobProfile();
  }
        
 public static void deleteJobProfile(){
        List<JobProfile> jobProfiles = new ArrayList<>();
        
        
        jobProfiles.add(new JobProfile("Criminal Lawyer", "Lee & Brothers", "Represents defendants and organizations with criminal charges.", 80000.0));
        jobProfiles.add(new JobProfile("Data Analyst", "DataCo", "Analyzing and interpreting data.", 60000.0));
        
        if (!jobProfiles.isEmpty()) {
            JobProfile jobToDelete = jobProfiles.get(0);
            jobProfiles.remove(0);

            System.out.println("Deleted Job Profile:");
            jobToDelete.displayJobProfile();
        } else {
            System.out.println("No job profiles to delete.");
        }
    }
 
 private static void deleteJobApplication() {
	 public void removeJobApplication(int index) {
	        if (index >= 0 && index < applications.size()) {
	            applications.remove(index);
	            System.out.println("Job application removed successfully.");
	        } else {
	            System.out.println("Invalid index.");
	        }
	    }
 
		
	

	private static void viewJobApplication() {
		
		public void viewJobApplications() {
	        if (applications.isEmpty()) {
	            System.out.println("No job applications available.");
	        } else {
	            for (int i = 0; i < applications.size(); i++) {
	                System.out.println("Application " + (i + 1) + ": " + applications.get(i));
	            }
	        }
		}
	

	private static void addJobApplication() {
		class JobApplicationManager {
		    private List<JobApplication> applications;

		    public JobApplicationManager() {
		        applications = new ArrayList<>();
		    }

		    public void addJobApplication(JobApplication application) {
		        applications.add(application);
		        System.out.println("Job application added successfully.");
		    }

		    public void viewJobApplications() {
		        if (applications.isEmpty()) {
		            System.out.println("No job applications available.");
		        } else {
		            for (int i = 0; i < applications.size(); i++) {
		                System.out.println("Application " + (i + 1) + ": " + applications.get(i));
		            }
	}

 
	        }
	    }
}
	}


    
    
    
    
