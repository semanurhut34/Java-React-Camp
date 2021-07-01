package kodlamaio.dayNineLectureTwo.business.abstracts;

import kodlamaio.dayNineLectureTwo.entities.concretes.JobSeeker;

public interface EmailService {
	
	void send(JobSeeker joobSeeker);
	

}
