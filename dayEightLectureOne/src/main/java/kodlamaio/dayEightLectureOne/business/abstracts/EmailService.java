package kodlamaio.dayEightLectureOne.business.abstracts;

import kodlamaio.dayEightLectureOne.entities.concretes.JobSeeker;

public interface EmailService {
	
	void send(JobSeeker joobSeeker);
	

}
