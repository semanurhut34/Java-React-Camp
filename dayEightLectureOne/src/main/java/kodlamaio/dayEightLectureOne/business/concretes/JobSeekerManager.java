package kodlamaio.dayEightLectureOne.business.concretes;

import java.rmi.RemoteException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kodlamaio.dayEightLectureOne.business.abstracts.EmailService;
import kodlamaio.dayEightLectureOne.business.abstracts.JobSeekerService;
import kodlamaio.dayEightLectureOne.core.rules.Rules;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.ErrorResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessDataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessResult;
import kodlamaio.dayEightLectureOne.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.dayEightLectureOne.dataAccess.abstracts.UserDao;
import kodlamaio.dayEightLectureOne.entities.concretes.JobSeeker;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class JobSeekerManager implements JobSeekerService {

	@Autowired
	private KPSPublicSoapProxy kpsSoapProxy;
	@Autowired
	private JobSeekerDao jobSeekerDao;

	@Autowired
	private EmailService emailService;
	@Autowired
	private UserDao userDao;

	public boolean verificationEmail(JobSeeker jobSeeker) {

		this.emailService.send(jobSeeker);
		return true;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "Data listelendi");

	}

	@Override
	public Result save(JobSeeker jobSeeker) throws RemoteException {
		Result result = Rules.run(Rules.checkFirstNameAndLastName(jobSeeker.getFirstName(), jobSeeker.getLastName()),
				Rules.checkIdentityNumber(jobSeeker.getIdentityNumber()),
				Rules.checkBirthDate(jobSeeker.getBirthDate()), Rules.checkPaswordChracter(jobSeeker.getPassword()),
				Rules.checkPasswordExists(jobSeeker.getPassword(), jobSeeker.getPasswordCheck()));

		if (!kpsSoapProxy.TCKimlikNoDogrula(jobSeeker.getIdentityNumber(), jobSeeker.getFirstName(),
				jobSeeker.getLastName(), jobSeeker.getBirthDate())) {
			return new ErrorResult("Tüzel kişi bulunmadı");
		}
		if (this.userDao.existsByEmail(jobSeeker.getEmail())) {
			return new ErrorResult("Email kullanımda!");
			
			
		}
		
		if(! result.isSuccess() ) {
			return new ErrorResult("Bilgiler hatalı.");
		}
		this.jobSeekerDao.save(jobSeeker);
		this.verificationEmail(jobSeeker);
		return new SuccessResult("Job Seeker eklendi.");
	}

	@Override
	public boolean checkIdentityNumber(Long identityNumber) {
		return this.jobSeekerDao.existsByIdentityNumber(identityNumber);

	}

}
