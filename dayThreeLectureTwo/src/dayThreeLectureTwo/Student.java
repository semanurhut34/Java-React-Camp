package dayThreeLectureTwo;

public class Student extends User{
	
	private String studentNo;
	private String courseName;
	
	
	public Student(int id, String firstName, String lastName, String email, String password ,String studentNo, String courseName) {
		super(id, firstName ,lastName,email,password);
		this.studentNo = studentNo;
		this.courseName = courseName;
	}


	public String getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
