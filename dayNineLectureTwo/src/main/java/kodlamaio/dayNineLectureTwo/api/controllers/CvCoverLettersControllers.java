package kodlamaio.dayNineLectureTwo.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvCoverLettersService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvCoverLetters;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvCoverLetterDto;

@RestController
@RequestMapping("/api/cvCoverLetters")
public class CvCoverLettersControllers {
	
	private CvCoverLettersService cvCoverLettersService;
    @Autowired
	public CvCoverLettersControllers(CvCoverLettersService cvCoverLettersService) {
		super();
		this.cvCoverLettersService = cvCoverLettersService;
	}
    
    @PostMapping("/add")
	public Result add(@RequestBody @Valid CvCoverLetterDto cvCoverLetterDto) {
		
		return this.cvCoverLettersService.add(cvCoverLetterDto);
	}
	
	
	
	@PostMapping("/update")
	public Result update(@RequestBody @Valid CvCoverLetterDto cvCoverLetterDto) {
		
		return this.cvCoverLettersService.update(cvCoverLetterDto);
	}
	
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CvCoverLetters cvCoverLetters) {
		
		return this.cvCoverLettersService.delete(cvCoverLetters);
	}
	

}
