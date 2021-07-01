package kodlamaio.dayNineLectureTwo.business.abstracts;


import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvExperiences;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvExperiencesDto;

public interface CvExperiencesService {
	
	Result add(CvExperiencesDto cvExperienceDto);
	
	Result update(CvExperiencesDto cvExperienceDto);
	
	Result delete(CvExperiences cvExperiences);
	

}
