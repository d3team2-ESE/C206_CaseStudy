public class Course {
	
	private static List<Course> courses;
	private String title;
	private String description;
	private String duration;
	private String targetAudience;
	private String price;
	private String teacher;

	public Course(String title, String description, String duration, String targetAudience, String price,
			String teacher) {
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.targetAudience = targetAudience;
		this.price = price;
		this.teacher = teacher;
	}






	public String addNewCourse(String newCourseTitle, String newTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCourseName() {
		return title;
	}

	public String getTeacher() {
		return teacher;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public static void main(String[] args) {
		List<Course> courses = new ArrayList<>();

		// Populate the list with sample course data
		courses.add(new Course("Introduction to Web Development",
				"Learn the basics of web development, including HTML, CSS, and JavaScript.", "8weeks", "Beginners",
				"199", "Emily Johnson"));
		courses.add(new Course("Digital Marketing Fundamentals",
				"Explore the world of digital marketing and learn about strategies for social media marketing",
				"6 weeks", "Professionals and Beginners", "149", "Benjamin Smith"));
		courses.add(new Course("Introduction to Data Science with Python",
				"Discover the basics of data analysis and visualization using Python.", "10 weeks", "Beginners", "249",
				"Emily Johnson"));
		courses.add(new Course("Photography Masterclass",
				"Unlock the art of photography. Learn about composition, lighting, and editing techniques to capture stunning photographs.",
				"4 weeks", "Professionals and Beginners", "129", "Sophia Williams"));
		courses.add(new Course("Chinese Language Immersion",
				"Immerse yourself in the beauty of the Chinese language and culture.", "12 weeks", "Beginners", "179",
				"Daniel Brown"));
		courses.add(new Course("Fitness and Wellness Coaching",
				"Transform your lifestyle with comprehensive fitness and wellness coaching. ", "8 weeks", "Beginners",
				"189", "Olivia Davis"));
	}

	
	public static void viewAllCourses(List<Course> courses) {
        System.out.println("All Courses:");
        for (Course course : courses) {
        	System.out.println("Course: " + course.getTitle());
			System.out.println("Description: " + course.getDescription());
			System.out.println("Duration: " + course.getDuration());
			System.out.println("Target Audience: " + course.getTargetAudience());
			System.out.println("Price: $" + course.getPrice());
			System.out.println("Teacher: " + course.getTeacher());
        }
	}

	public static void AddCourses() {
		Scanner scanner = new Scanner(System.in);

		String newCourseTitle = System.console().readLine("Enter the name of the new course: ");
		String newCourseDescription = System.console().readLine("Enter the description for the new course: ");
		String newDuration = System.console().readLine("Enter the duration for the new course: ");
		String newTargetAudience = System.console().readLine("Enter the target audience for the new course: ");
		String newPrice = System.console().readLine("Enter the price for the new course: ");
		String newTeacher = System.console().readLine("Enter the instructor of the new course: ");

		Course newCourse = new Course(newCourseTitle, newCourseDescription, newDuration, newTargetAudience, newPrice,
				newTeacher);
		Course.add(newCourse);

		System.out.println("New course added:");
		System.out.println("Course: " + newCourse.getCourseName());
		System.out.println("Instructor: " + newCourse.getTeacher());

	}

	static void add(Course newCourse) {
		// TODO Auto-generated method stub
		
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
////
	 public static boolean deleteCourse(List<Course> courses, String courseName) {
	        Course courseToRemove = null;

	        for (int i = 0; i < courses.size(); i++) {
	            Course course = courses.get(i);
	            if (course.getCourseName().equalsIgnoreCase(courseName)) {
	                courseToRemove = course;
	                courses.remove(i);
	                return true;
	            }
	        }

	        return false;
	    }



	public static void add(Course newCourse) {
		System.out.println("New course added:");
		System.out.println("Course: " + newCourse.getCourseName());
		System.out.println("Instructor: " + newCourse.getTeacher());
		
	}
	}