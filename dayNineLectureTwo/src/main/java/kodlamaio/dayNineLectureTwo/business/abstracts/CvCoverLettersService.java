package kodlamaio.dayNineLectureTwo.business.abstracts;


import javax.validation.Valid;

import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvCoverLetters;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvCoverLetterDto;

public interface CvCoverLettersService {
	
	Result add( CvCoverLetterDto cvCoverLetterDto);
	
	Result update(@Valid CvCoverLetterDto cvCoverLetterDto);
	
	Result delete(CvCoverLetters cvCoverLetters);
	

}
