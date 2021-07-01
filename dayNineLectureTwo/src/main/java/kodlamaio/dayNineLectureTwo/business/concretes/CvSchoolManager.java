package kodlamaio.dayNineLectureTwo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvSchoolService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvSchoolDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvSchool;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvSchoolDto;

@Service
public class CvSchoolManager implements CvSchoolService{
	
	private CvSchoolDao cvSchoolDao;
	
   @Autowired
	public CvSchoolManager(CvSchoolDao cvSchoolDao) {
		super();
		this.cvSchoolDao = cvSchoolDao;
	}

	@Override
	public Result add(CvSchoolDto cvSchoolDto) {
		CvSchool cvSchool = new CvSchool();
		Cv cv = new Cv();
		cv.setId(cvSchoolDto.getCvId());
		cvSchool.setCv(cv);
		cvSchool.setSection(cvSchoolDto.getSection());
		cvSchool.setStartAt(cvSchoolDto.getStartAt());
		cvSchool.setEndAt(cvSchool.getEndAt());
		this.cvSchoolDao.save(cvSchool);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result update(CvSchoolDto cvSchoolDto) {
		CvSchool cvSchool = new CvSchool();
		Cv cv = new Cv();
		cv.setId(cvSchoolDto.getCvId());
		cvSchool.setCv(cv);
		cvSchool.setSection(cvSchoolDto.getSection());
		cvSchool.setStartAt(cvSchoolDto.getStartAt());
		cvSchool.setEndAt(cvSchool.getEndAt());
		this.cvSchoolDao.save(cvSchool);
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public Result delete(CvSchool cvSchool) {
		this.cvSchoolDao.delete(cvSchool);
		return new SuccessResult("Silindi.");
	}

}
