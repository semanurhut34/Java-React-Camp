package dayThreeLectureTwo;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Semanur", "Hut", "semanur@gmail.com","5678","1070", "JAVA Camp");
		Student student2 = new Student(2,"Sema", "Can", "sema@gmail.com","567","12", "Python Camp");
		
		Instructor instructor = new Instructor(3, "Engin", "Demirog", "engin@gmail.com", "helloworld", "MCT,PMP,ITIL");
		
		
		
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.delete(instructor);
		
        StudentManager studentManager = new StudentManager();
        studentManager.update(student2);
        
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCertificates(instructor);
        
		
	
		
		
		
		

	}

}
