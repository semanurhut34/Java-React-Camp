package kodlamaio.dayEightLectureOne.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayEightLectureOne.business.abstracts.EmployerService;
import kodlamaio.dayEightLectureOne.core.rules.Rules;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.ErrorResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessDataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessResult;
import kodlamaio.dayEightLectureOne.dataAccess.abstracts.EmployerDao;
import kodlamaio.dayEightLectureOne.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
    @Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
    

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"Data listelendi");	
	}

	@Override
	public Result save(Employer employer) {
		Result result =Rules.run(Rules.checkcompanyName(employer.getCompanyName()) , 
				Rules.checkwebAdress(employer.getWebAddress()) , 
				Rules.checkphoneNumber(employer.getPhoneNumber()),Rules.checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebAddress()));
		if(!result.isSuccess()) {
			return new ErrorResult("İş veren bilgileri hatalı.");
		}
		this.employerDao.save(employer);
		return new SuccessResult("Employer eklendi.");
	}


}
