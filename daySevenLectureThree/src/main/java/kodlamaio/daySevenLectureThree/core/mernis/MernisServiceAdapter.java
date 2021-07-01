package kodlamaio.daySevenLectureThree.core.mernis;

import java.util.Locale;

import org.springframework.stereotype.Service;

import kodlamaio.daySevenLectureThree.business.abstracts.JobSeekerCheckService;
import kodlamaio.daySevenLectureThree.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;




@Service
public class MernisServiceAdapter implements JobSeekerCheckService {
	@Override
	public boolean CheckIfRealPerson(JobSeeker jobSeeker) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result =false;
		try {
			result= client.TCKimlikNoDogrula( jobSeeker.getIdentityNumber(), 
	        		jobSeeker.getFirstName().toUpperCase(new Locale ("tr")),
	        		jobSeeker.getLastName().toUpperCase(new Locale ("tr")), 
	        		jobSeeker.getBirthDate());
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
	
		
		return result;
	}
	

}
