package kodlamaio.dayNineLectureTwo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvProgrammingSkillsService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvProgrammingSkillsDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvProgrammingSkills;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvProgrammingSkillDto;

@Service
public class CvProgrammingSkillsManager implements CvProgrammingSkillsService{
	
	private CvProgrammingSkillsDao cvProgrammingSkillsDao;
	
    @Autowired
	public CvProgrammingSkillsManager(CvProgrammingSkillsDao cvProgrammingSkillsDao) {
		super();
		this.cvProgrammingSkillsDao = cvProgrammingSkillsDao;
	}

	@Override
	public Result add(CvProgrammingSkillDto cvProgrammingSkillDto) {
		CvProgrammingSkills cvProgrammingSkills = new CvProgrammingSkills();
		Cv cv = new Cv();
		cv.setId(cvProgrammingSkillDto.getCvId());
		cvProgrammingSkills.setCv(cv);
		cvProgrammingSkills.setSkillName(cvProgrammingSkillDto.getSkillName());
		this.cvProgrammingSkillsDao.save(cvProgrammingSkills);
		return new SuccessResult("Eklendi.");
		}

	@Override
	public Result update(CvProgrammingSkillDto cvProgrammingSkillDto) {
		CvProgrammingSkills cvProgrammingSkills = new CvProgrammingSkills();
		Cv cv = new Cv();
		cv.setId(cvProgrammingSkillDto.getCvId());
		cvProgrammingSkills.setCv(cv);
		cvProgrammingSkills.setSkillName(cvProgrammingSkillDto.getSkillName());
		this.cvProgrammingSkillsDao.save(cvProgrammingSkills);
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public Result delete(CvProgrammingSkills cvProgrammingSkills) {
		this.cvProgrammingSkillsDao.delete(cvProgrammingSkills);
		return new SuccessResult("Silindi..");
	}

}
