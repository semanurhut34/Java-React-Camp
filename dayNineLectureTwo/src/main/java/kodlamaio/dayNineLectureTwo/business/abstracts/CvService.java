package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;

public interface CvService {
	
	DataResult<List<Cv>> getAll();
	
	DataResult<List<Cv>> findByJobSeekerId(int id);
	
	Result add(Cv cv);
	
	Result update(Cv cv);
	
	Result delete(Cv cv); //id kullan

}
