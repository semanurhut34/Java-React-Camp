package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.Employer;
import kodlamaio.dayNineLectureTwo.entities.dtos.EmployerSaveDto;

@Service
public interface EmployerService {
	
	DataResult<List<Employer>> getAll();
	Result save(EmployerSaveDto employerSaveDto);
	
}
