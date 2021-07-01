package kodlamaio.dayNineLectureTwo.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvImagesService;
import kodlamaio.dayNineLectureTwo.core.cloudinary.CloudinaryService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvImagesDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvImages;


@Service
public class CvImagesManager   implements CvImagesService{

	private CvImagesDao cvImagesDao;
	private CloudinaryService cloudinaryService;
	
	
    @Autowired
	public CvImagesManager(CvImagesDao cvImagesDao,CloudinaryService cloudinaryService) {
		super();
		this.cvImagesDao = cvImagesDao;
		this.cloudinaryService = cloudinaryService;
	}

	@Override
	public Result add(int cvId,MultipartFile imageFile) {
		CvImages cvImages = new CvImages();
		Cv cv = new Cv();
		cv.setId(cvId);
		cvImages.setCv(cv);
		cvImages.setUrl((String) this.cloudinaryService.save(imageFile).getData().get("url"));
		this.cvImagesDao.save(cvImages);
		return new SuccessResult("Eklendi.");
		
	}

	@Override
	public Result update(int cvImageId,MultipartFile imageFile) {
		CvImages cvImages = cvImagesDao.findById(cvImageId).orElse(null);
		if(cvImages == null) {
			return new ErrorResult("Fotoğraf bulunamadı.");
		}
		cvImages.setUrl((String) this.cloudinaryService.save(imageFile).getData().get("url"));
		this.cvImagesDao.save(cvImages);
		return new SuccessResult("Güncellendi.");
		
		
	}

	@Override
	public Result delete(int cvImageId) {
		this.cvImagesDao.deleteById(cvImageId);
        return new SuccessResult("Silindi.");
        }

}
