package kodlamaio.dayEightLectureOne.business.abstracts;



import kodlamaio.dayEightLectureOne.entities.concretes.JobSeeker;



public interface JobSeekerCheckService {
	

	boolean CheckIfRealPerson(JobSeeker jobSeeker);

}
