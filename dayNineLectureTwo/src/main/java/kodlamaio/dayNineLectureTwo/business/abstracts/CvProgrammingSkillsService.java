package kodlamaio.dayNineLectureTwo.business.abstracts;


import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvProgrammingSkills;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvProgrammingSkillDto;

public interface CvProgrammingSkillsService {
	Result add(CvProgrammingSkillDto cvProgrammingSkillDto);
	
	Result update(CvProgrammingSkillDto cvProgrammingSkillDto);
	
	Result delete(CvProgrammingSkills cvProgrammingSkills);

}
