package kodlamaio.dayNineLectureTwo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvCoverLettersService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvCoverLettersDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvCoverLetters;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvCoverLetterDto;

@Service
public class CvCoverLettersManager implements CvCoverLettersService{
	
	private CvCoverLettersDao cvCoverLettersDao;
    @Autowired
	public CvCoverLettersManager(CvCoverLettersDao cvCoverLettersDao) {
		super();
		this.cvCoverLettersDao = cvCoverLettersDao;
	}

	@Override
	public Result add(CvCoverLetterDto cvCoverLetterDto) {
		CvCoverLetters cvCoverLetters = new CvCoverLetters();
		Cv cv = new Cv();
		cv.setId(cvCoverLetterDto.getCvId());
		cvCoverLetters.setContent(cvCoverLetterDto.getContent());
		cvCoverLetters.setCv(cv);
		this.cvCoverLettersDao.save(cvCoverLetters);
		return new SuccessResult("Eklendi");
				
	}

	@Override
	public Result update(CvCoverLetterDto cvCoverLetterDto) {
		CvCoverLetters cvCoverLetters = new CvCoverLetters();
		Cv cv = new Cv();
		cv.setId(cvCoverLetterDto.getCvId());
		cvCoverLetters.setContent(cvCoverLetterDto.getContent());
		cvCoverLetters.setCv(cv);
		this.cvCoverLettersDao.save(cvCoverLetters);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public Result delete(CvCoverLetters cvCoverLetters) {
		this.cvCoverLettersDao.delete(cvCoverLetters);
		return new SuccessResult("Silindi");
		}

}
