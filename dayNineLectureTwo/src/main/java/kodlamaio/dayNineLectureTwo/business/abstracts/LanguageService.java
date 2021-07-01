package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.Language;

public interface LanguageService {
	
	DataResult<List<Language>> findAll();

}
