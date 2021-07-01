package kodlamaio.dayNineLectureTwo.business.abstracts;


import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvForeignLanguages;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvForeignLanguageDto;

public interface CvForeignLanguagesService {
	
	Result add(CvForeignLanguageDto cvForeignLanguageDto);
	
	Result update(CvForeignLanguageDto cvForeignLanguageDto);
	
	Result delete(CvForeignLanguages cvForeignLanguages);

}
