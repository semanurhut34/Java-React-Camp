package kodlamaio.dayNineLectureTwo.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.CvLinksService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvLinks;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvLinkDto;

@RestController
@RequestMapping("/api/cvLink")
public class CvLinkControllers {
	
	private CvLinksService  cvLinksService;
    @Autowired
	public CvLinkControllers(CvLinksService cvLinksService) {
		super();
		this.cvLinksService = cvLinksService;
	}
    
    @PostMapping("/add")
	public Result add(@RequestBody @Valid CvLinkDto cvLinkDto) {
		return this.cvLinksService.add(cvLinkDto);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody @Valid CvLinkDto cvLinkDto) {
		return this.cvLinksService.update(cvLinkDto);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CvLinks cvLinks) {
		return this.cvLinksService.delete(cvLinks);
	}

}
