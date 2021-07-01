package kodlamaio.dayNineLectureTwo.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvForeignLanguagesService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvForeignLanguages;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvForeignLanguageDto;

@RestController
@RequestMapping("/api/cvForeignLanguage")
public class CvForeignLanguageControllers {
	
	private CvForeignLanguagesService cvForeignLanguagesService;
   @Autowired
	public CvForeignLanguageControllers(CvForeignLanguagesService cvForeignLanguagesService) {
		super();
		this.cvForeignLanguagesService = cvForeignLanguagesService;
	}
   
   @PostMapping("/add")
	public Result add(@RequestBody @Valid CvForeignLanguageDto cvForeignLanguageDto) {
		return this.cvForeignLanguagesService.add(cvForeignLanguageDto);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody @Valid  CvForeignLanguageDto cvForeignLanguageDto) {
		return this.cvForeignLanguagesService.update(cvForeignLanguageDto);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CvForeignLanguages cvForeignLanguages) {
		
		return this.cvForeignLanguagesService.delete(cvForeignLanguages);
	}

}
