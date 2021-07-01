package kodlamaio.dayNineLectureTwo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvForeignLanguagesService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvForeignLanguagesDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvForeignLanguages;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvForeignLanguageDto;

@Service
public class CvForeignLanguagesManager implements CvForeignLanguagesService{
	
	private CvForeignLanguagesDao cvForeignLanguagesDao;
	
    @Autowired
	public CvForeignLanguagesManager(CvForeignLanguagesDao cvForeignLanguagesDao) {
		super();
		this.cvForeignLanguagesDao = cvForeignLanguagesDao;
	}

	@Override
	public Result add(CvForeignLanguageDto cvForeignLanguageDto) {
		CvForeignLanguages cvForeignLanguages = new CvForeignLanguages();
		Cv cv = new Cv();
		cvForeignLanguages.setId(cv.getId());
		cvForeignLanguages.setLanguage(cvForeignLanguageDto.getLanguage());
		cvForeignLanguages.setLevel(cvForeignLanguageDto.getLevel());
		this.cvForeignLanguagesDao.save(cvForeignLanguages);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(CvForeignLanguageDto cvForeignLanguageDto) {
		CvForeignLanguages cvForeignLanguages = new CvForeignLanguages();
		Cv cv = new Cv();
		cvForeignLanguages.setId(cv.getId());
		cvForeignLanguages.setLanguage(cvForeignLanguageDto.getLanguage());
		cvForeignLanguages.setLevel(cvForeignLanguageDto.getLevel());
		this.cvForeignLanguagesDao.save(cvForeignLanguages);
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public Result delete(CvForeignLanguages cvForeignLanguages) {
		this.cvForeignLanguagesDao.delete(cvForeignLanguages);
		return new SuccessResult("Silindi.");
	}

}
