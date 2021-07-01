package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.JobTitle;

 
@Service
public interface JobTitleService {
	DataResult<List<JobTitle>> getAll();
	Result save(JobTitle jobTitle);

}
