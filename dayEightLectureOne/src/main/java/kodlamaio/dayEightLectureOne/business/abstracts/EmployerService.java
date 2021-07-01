package kodlamaio.dayEightLectureOne.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.Employer;

@Service
public interface EmployerService {
	
	DataResult<List<Employer>> getAll();
	Result save(Employer employer);
	
}
