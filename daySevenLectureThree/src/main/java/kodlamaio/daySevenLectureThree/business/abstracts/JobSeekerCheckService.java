package kodlamaio.daySevenLectureThree.business.abstracts;

import kodlamaio.daySevenLectureThree.entities.concretes.JobSeeker;

public interface JobSeekerCheckService {
	boolean CheckIfRealPerson(JobSeeker jobSeeker);
	
}
