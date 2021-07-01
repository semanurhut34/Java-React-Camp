package dayThreeLectureTwo;

public class InstructorManager extends UserManager {
	
	public void addCertificates(Instructor instructor) {
		
		System.out.println("instructor name: "+instructor.getFirstName() +" "+  instructor.getCertificate() + " Certificates has been added. ");
	}

}
