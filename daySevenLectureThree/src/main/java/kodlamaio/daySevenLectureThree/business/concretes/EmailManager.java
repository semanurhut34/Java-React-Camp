package kodlamaio.daySevenLectureThree.business.concretes;


import org.springframework.stereotype.Service;

import kodlamaio.daySevenLectureThree.business.abstracts.EmailService;

import kodlamaio.daySevenLectureThree.entities.concretes.JobSeeker;

@Service
public class EmailManager implements EmailService{
  

	@Override
	public void send(JobSeeker jobSeeker) {
		System.out.println("Confirmation mail : " + jobSeeker.getEmail()  + " message"+ jobSeeker.getFirstName() + "sent to address.");
		

		
	}

	

}
