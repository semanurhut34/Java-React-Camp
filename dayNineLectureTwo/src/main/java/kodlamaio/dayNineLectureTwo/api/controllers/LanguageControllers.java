package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayNineLectureTwo.business.abstracts.LanguageService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.Language;

@RestController
@RequestMapping("/api/language")
public class LanguageControllers {
	private LanguageService languageService;
    @Autowired
	public LanguageControllers(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
    
    public DataResult<List<Language>> getAll(@RequestBody Language language) {
    	return languageService.findAll();
    }

}
