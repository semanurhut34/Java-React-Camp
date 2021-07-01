package kodlamaio.dayNineLectureTwo.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvExperiencesService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvExperiences;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvExperiencesDto;

@RestController
@RequestMapping("/api/cvExperiences")
public class CvExperiencesControllers {
	private CvExperiencesService cvExperiencesService;
    @Autowired
	public CvExperiencesControllers(CvExperiencesService cvExperiencesService) {
		super();
		this.cvExperiencesService = cvExperiencesService;
	}
    
    @PostMapping("/add")
	public Result add(@RequestBody @Valid CvExperiencesDto cvExperienceDto) {
		return this.cvExperiencesService.add(cvExperienceDto);
	}
	
	
	
	@PostMapping("/update")
	public Result update(@RequestBody @Valid CvExperiencesDto cvExperienceDto) {
		return this.cvExperiencesService.update(cvExperienceDto);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CvExperiences cvExperience) {
		
		return this.cvExperiencesService.delete(cvExperience);
	}
	

}
