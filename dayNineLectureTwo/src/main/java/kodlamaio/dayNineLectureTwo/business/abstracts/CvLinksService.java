package kodlamaio.dayNineLectureTwo.business.abstracts;


import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvLinks;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvLinkDto;

public interface CvLinksService {
	
	Result add(CvLinkDto cvLinkDto);
	
	Result update(CvLinkDto cvLinkDto);
	
	Result delete(CvLinks cvLinks);

}
