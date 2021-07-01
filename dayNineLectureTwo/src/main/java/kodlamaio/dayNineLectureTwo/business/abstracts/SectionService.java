package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.Section;

public interface SectionService {
	
	DataResult<List<Section>> findAll();
	
	DataResult<List<Section>> findByFacultyId(int id);

}
