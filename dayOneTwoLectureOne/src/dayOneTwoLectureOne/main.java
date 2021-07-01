package dayOneTwoLectureOne;

public class main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Yazilim Gelistirici Yetistirme Kampi ", "C# + ANGULAR");
		Course course2 = new Course(2, "Yazilim Gelistirici Yetistirme Kampi ", "JAVA + REACT");
		Course course3 = new Course(3, "Programlamaya Giris Temel Kurs ", "PYTHON");

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.courseName +" "+ course.programingLanguage);
		}
		System.out.println(courses.length);

		Instructor instructor = new Instructor(1, "Engin", "Demirog", 34, "MCT,PMP,ITIL");

		System.out.println("About the instructor: " 
			+"\n"+ "Name:" + instructor.firstName
			+"\n"+ "Last Name: "+ instructor.lastName 
			+"\n"+ "Age: " + instructor.age
			+"\n"+ "Certificates: " + instructor.certificate+"\n" );

		CourseManager courseManager = new CourseManager();

		courseManager.addToCard(course1);
		courseManager.register(course2);
		courseManager.addToCard(course3);
		
		

	}

}
