package kodlamaio.dayNineLectureTwo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvExperiencesService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvExperiencesDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvExperiences;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvExperiencesDto;

@Service
public class CvExperiencesManager implements CvExperiencesService{
	
	private CvExperiencesDao cvExperiencesDao;
	
    @Autowired
	public CvExperiencesManager(CvExperiencesDao cvExperiencesDao) {
		super();
		this.cvExperiencesDao = cvExperiencesDao;
	}

	@Override
	public Result add(CvExperiencesDto cvExperienceDto) {
		CvExperiences cvExperiences = new CvExperiences();
		Cv cv = new Cv();
		cv.setId(cvExperienceDto.getCvId());
		cvExperiences.setCv(cv);
		cvExperiences.setWorkingPlace(cvExperienceDto.getWorkingPlace());
		cvExperiences.setPosition(cvExperienceDto.getPosition());
		cvExperiences.setStartAt(cvExperienceDto.getStartAt());
		cvExperiences.setEndAt(cvExperienceDto.getEndAt());
		this.cvExperiencesDao.save(cvExperiences);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(CvExperiencesDto cvExperienceDto) {
		CvExperiences cvExperiences = new CvExperiences();
		Cv cv = new Cv();
		cv.setId(cvExperienceDto.getCvId());
		cvExperiences.setCv(cv);
		cvExperiences.setWorkingPlace(cvExperienceDto.getWorkingPlace());
		cvExperiences.setPosition(cvExperienceDto.getPosition());
		cvExperiences.setStartAt(cvExperienceDto.getStartAt());
		cvExperiences.setEndAt(cvExperienceDto.getEndAt());
		this.cvExperiencesDao.save(cvExperiences);
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public Result delete(CvExperiences cvExperiences) {
		this.cvExperiencesDao.delete(cvExperiences);
		return new SuccessResult("Silindi.");
	}

}
