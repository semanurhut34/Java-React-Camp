package kodlamaio.dayEightLectureOne.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayEightLectureOne.business.abstracts.JobTitleService;

import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;

import kodlamaio.dayEightLectureOne.core.utilities.results.ErrorResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessResult;
import kodlamaio.dayEightLectureOne.dataAccess.abstracts.JobTitleDao;
import kodlamaio.dayEightLectureOne.entities.concretes.JobTitle;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessDataResult;
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
