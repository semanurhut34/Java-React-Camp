package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.EmployerService;
import kodlamaio.dayNineLectureTwo.core.rules.Rules;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.EmployerDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Employer;
import kodlamaio.dayNineLectureTwo.entities.dtos.EmployerSaveDto;


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
	public Result save(EmployerSaveDto employerSaveDto) {
		Result result =Rules.run(Rules.checkcompanyName(employerSaveDto.getCompanyName()) , 
				Rules.checkwebAdress(employerSaveDto.getWebAddress()) , 
				Rules.checkphoneNumber(employerSaveDto.getPhoneNumber()),Rules.checkIfEqualEmailAndDomain(employerSaveDto.getEmail(), employerSaveDto.getWebAddress()));
		if(!result.isSuccess()) {
			return new ErrorResult("İş veren bilgileri hatalı.");
		}
		Employer employer=new Employer();
		employer.setCompanyName(employerSaveDto.getCompanyName());
		employer.setPhoneNumber(employerSaveDto.getPhoneNumber());
		employer.setWebAddress(employerSaveDto.getWebAddress());
		employer.setEmail(employerSaveDto.getEmail());
		employer.setPassword(employerSaveDto.getPassword());
		this.employerDao.save(employer);
		return new SuccessResult("Employer eklendi.");
	}


}
