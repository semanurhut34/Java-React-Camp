package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.University;

public interface UniversityService {
	
	DataResult<List<University>> findAll();
	DataResult<List<University>> finByCityId(int id);

}
