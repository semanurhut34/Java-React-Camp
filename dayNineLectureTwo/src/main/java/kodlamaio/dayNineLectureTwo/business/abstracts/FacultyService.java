package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.Faculty;

public interface FacultyService {
	
	
	DataResult<List<Faculty>> findAll();
	
	DataResult<List<Faculty>> findByUniversityId(int id);

}
