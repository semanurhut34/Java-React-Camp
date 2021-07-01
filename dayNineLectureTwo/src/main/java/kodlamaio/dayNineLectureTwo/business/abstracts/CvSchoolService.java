package kodlamaio.dayNineLectureTwo.business.abstracts;


import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvSchool;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvSchoolDto;

public interface CvSchoolService {
	
	Result add(CvSchoolDto cvSchoolDto);
	
	Result update(CvSchoolDto cvSchoolDto);
	
	Result delete(CvSchool cvSchool);

}
