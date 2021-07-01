package kodlamaio.dayNineLectureTwo.business.abstracts;


import org.springframework.web.multipart.MultipartFile;

import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvImages;

public interface CvImagesService {
	Result add(int cvId,MultipartFile imageFile);
	
	Result update(int cvImageId,MultipartFile imageFile);
	
	Result delete(int cvImageId);

}
