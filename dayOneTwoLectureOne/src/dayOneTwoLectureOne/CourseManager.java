package dayOneTwoLectureOne;

public class CourseManager {

	public void register(Course course) {
		System.out.println("Course has been registered. " + course.courseName);
	}

	public void addToCard(Course course) {
		System.out.println("Course added to cart. " + course.courseName);
	}

}
