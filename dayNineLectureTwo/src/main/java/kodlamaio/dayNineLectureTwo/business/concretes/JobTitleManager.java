package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.JobTitleService;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;

import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.JobTitleDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.JobTitle;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
@Service
public class JobTitleManager implements JobTitleService{
	
	
	private JobTitleDao jobTitleDao;
    @Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
    
   
    

	@Override
	public DataResult<List<JobTitle>> getAll() {
		
		return new SuccessDataResult<List<JobTitle>>
		(this.jobTitleDao.findAll(),"Data listelendi");	
	}

	@Override
	public Result save(JobTitle jobTitle) {
		
		if(jobTitleDao.existsByTitle(jobTitle.getTitle())) {
			return new ErrorResult("Bu iş başlığı mevcuttur.");
		}
		
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Job Title eklendi.");
	}





}
