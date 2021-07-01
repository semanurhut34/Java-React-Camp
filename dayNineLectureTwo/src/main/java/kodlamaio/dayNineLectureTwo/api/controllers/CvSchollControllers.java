package kodlamaio.dayNineLectureTwo.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.CvSchoolService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvSchool;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvSchoolDto;

@RestController
@RequestMapping("/api/cvSchool")
public class CvSchollControllers {
	
	private CvSchoolService cvSchoolService;
    @Autowired
	public CvSchollControllers(CvSchoolService cvSchoolService) {
		super();
		this.cvSchoolService = cvSchoolService;
	}
    @PostMapping("/add")
	public Result add(@RequestBody @Valid CvSchoolDto cvSchoolDto) {
		return this.cvSchoolService.add(cvSchoolDto);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody @Valid CvSchoolDto cvSchoolDto) {
		return this.cvSchoolService.update(cvSchoolDto);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CvSchool cvSchool) {
		return this.cvSchoolService.delete(cvSchool);
	}
	

}
