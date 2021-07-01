package kodlamaio.dayNineLectureTwo.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvProgrammingSkillsService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvProgrammingSkills;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvProgrammingSkillDto;

@RestController
@RequestMapping("/api/cvProgrammingSkill")
public class CvProgrammingSkillControllers {
	
	private CvProgrammingSkillsService  cvProgrammingSkillsService;
    @Autowired
	public CvProgrammingSkillControllers(CvProgrammingSkillsService cvProgrammingSkillsService) {
		super();
		this.cvProgrammingSkillsService = cvProgrammingSkillsService;
	}
    
    @PostMapping("/add")
	public Result add(@RequestBody @Valid CvProgrammingSkillDto cvProgrammingSkillDto) {
		return this.cvProgrammingSkillsService.add(cvProgrammingSkillDto);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody @Valid CvProgrammingSkillDto cvProgrammingSkillDto) {
		return this.cvProgrammingSkillsService.update(cvProgrammingSkillDto);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CvProgrammingSkills cvProgrammingSkills) {
		return this.cvProgrammingSkillsService.delete(cvProgrammingSkills);
	}

}
