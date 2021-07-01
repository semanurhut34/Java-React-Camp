package kodlamaio.daySixLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.daySixLectureTwo.business.abstracts.JobTitleService;
import kodlamaio.daySixLectureTwo.dataAccess.abstracts.JobTitleDao;
import kodlamaio.daySixLectureTwo.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}



	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}
	

}
