package kodlamaio.dayEightLectureOne.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.JobTitle;


@Service
public interface JobTitleService {
	DataResult<List<JobTitle>> getAll();
	Result save(JobTitle jobTitle);

}
