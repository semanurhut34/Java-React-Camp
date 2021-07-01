package kodlamaio.dayNineLectureTwo.business.abstracts;



import kodlamaio.dayNineLectureTwo.entities.concretes.JobSeeker;



public interface JobSeekerCheckService {
	

	boolean CheckIfRealPerson(JobSeeker jobSeeker);

}
