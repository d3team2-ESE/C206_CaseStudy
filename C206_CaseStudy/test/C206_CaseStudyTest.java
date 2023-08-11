import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
//
	private RegisterUser user1;
	private RegisterUser user2;
	private RegisterUser user3;

	ArrayList<RegisterUser> userList;

	public void testAddCourse() {
		Course newCourse = new Course();
		C206_CaseStudy.addNewCourse("Test Course", "Test Teacher");

		List<Course> courses = C206_CaseStudy.getCourses(); // Assuming you have a getCourses() method

		assertEquals(1, courses.size());

		Course addedCourse = courses.get(0);
		assertEquals("Test Course", addedCourse.getCourseName());
		assertEquals("Test Instructor", addedCourse.getTeacher());
	}

	@Before
	public void setUp() throws Exception {

		user1 = new RegisterUser("John", "john@email.com", "passwordjohn");
		user2 = new RegisterUser("Jane", "jane@email.com", "pwd");
		user3 = new RegisterUser("Mary", "", "passwordmary");

	}

	@Test
	public void testSuccessfulRegistration() {

		assertEquals("userList size should be 0", 0, userList.size());

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);

		assertEquals("userList size should be 3 after adding users", 3, userList.size());

	}

	@Test
	public void testPasswordLength() {

		assertTrue("Valid password should pass the validation", user1.getPassword().length() >= 6);
		assertFalse("Invalid password should not pass the validation", user2.getPassword().length() >= 6);
	}

	@Test
    public void testImcompleteFields() {
    	
        
        assertTrue("User with missing email should not be valid", !user3.getEmail().isEmpty());

	@Test
	public void testViewAllCourses() {
		Course newCourse = new Course();
		C206_CaseStudy.Course.addCourse("Test Course 1", "Test description 1", "Test duration 1",
				"Test TargetAudience 1", "Test Teacher 1");
		course.addCourse("Test Course 2", "Test description 2", "Test duration 2", "Test TargetAudience 2",
				"Test Teacher 2");
		course.addCourse("Test Course 3", "Test description 3", "Test duration 3", "Test TargetAudience 3",
				"Test Teacher 3");

		List<C206_CaseStudy.Course> courses = C206_CaseStudy.viewAllCourses();

		assertEquals(3, courses.size());

		C206_CaseStudy.Course course1 = courses.get(0);
		assertEquals("Test Course 1", course1.getCourseName());
		assertEquals("Test Instructor 1", course1.getTeacher());

		C206_CaseStudy.Course course2 = courses.get(1);
		assertEquals("Test Course 2", course2.getCourseName());
		assertEquals("Test Instructor 2", course2.getTeacher());

		C206_CaseStudy.Course course3 = courses.get(2);
		assertEquals("Test Course 3", course3.getCourseName());
		assertEquals("Test Instructor 3", course3.getTeacher());
	}

	}

	@Test
	public void viewAllProfileTest() {

		// Test if the list is not null but empty
		assertNotNull("Test if the list is not null but empty", ProfileDB.ProfileList);

		// Test if the list of Profile list is empty
		assertEquals("Test if the Profile list is empty", 0, ProfileDB.ProfileList.size());

		// Test that Profile list is viewable
		ProfileDB.addProfile(Profile1);
		ProfileDB.addProfile(Profile2);
		assertEquals("Test that Profile list is 2", 2, ProfileDB.ProfileList.size());

		// Test that the first element in Profile list is the same as the Profile object
		// added
		assertSame("Test that the first element in Profile list is the same as the Profile object added", Profile1,
				ProfileDB.ProfileList.get(0));

	}

	@Test
	public void deleteProfileorTest() {

		// Test if the Profile list is empty
		assertEquals("Test that if the Profile list is empty", 0, ProfileDB.ProfileList.size());

		// Test that Profile list is not null
		assertNotNull("Test that Profile list is not null", ProfileDB.ProfileList);

		// Test that Profile list size is 1 after deleting an Profile
		ProfileDB.delProfile(Profile1);
		assertEquals("Test that Profile list size is 1 after deleting an Profile", 0, ProfileDB.ProfileList.size());

	}

	@Test
	public void updateProfileTest() {
		// add Profile into list
		ProfileDB.addProfile(Profile1);
		ProfileDB.addProfile(Profile2);
		Profile3 = new Profile("Lucas", "lucas123456@gmail.com", "123456");
		ProfileDB.updateProfile(Profile3);
		assertSame(Profile3, ProfileDB.ProfileList.get(0));

		// Test that Profile list is not null
		assertNotNull("Test that Profile list is not null", ProfileDB.ProfileList);

	}

	}

	@After
	public void tearDown() throws Exception {
		user1 = null;
		user2 = null;
		user3 = null;
		userList = null;
	}

}

	public void testDeleteCourse() {
		Course newCourse = new Course();
		C206_CaseStudy.Course.addCourse("Test Course 1", "Test description 1", "Test duration 1",
				"Test TargetAudience 1", "Test Teacher 1");
		C206_CaseStudy.Course.addCourse("Test Course 2", "Test description 2", "Test duration 2",
				"Test TargetAudience 2", "Test Teacher 2");
		C206_CaseStudy.Course.addCourse("Test Course 3", "Test description 3", "Test duration 3",
				"Test TargetAudience 3", "Test Teacher 3");

		assertTrue(Course.deleteCourse("Test Course 2"));

		List<Course> courses = Course.viewAllCourses();

		assertEquals(2, courses.size());

		assertFalse(Course.deleteCourse("Nonexistent Course"));
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void c206_test() {

		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
