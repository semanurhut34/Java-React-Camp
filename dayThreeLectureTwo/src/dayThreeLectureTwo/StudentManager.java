package dayThreeLectureTwo;

public class StudentManager extends UserManager {
	
	public void update(Student student) {
		System.out.println("System has been updated: " + student.getCourseName());
	}

}
