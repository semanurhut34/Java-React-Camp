package kodlamaio.dayNineLectureTwo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import kodlamaio.dayNineLectureTwo.business.abstracts.CvImagesService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;

@RestController
@RequestMapping("/api/cvImages")
public class CvImagesControllers {
	private CvImagesService cvImagesService;
	
    @Autowired
	public CvImagesControllers(CvImagesService cvImagesService) {
		super();
		this.cvImagesService = cvImagesService;
	}
    
    @PostMapping("/add")
	public Result add(@RequestBody MultipartFile imageFile, @RequestParam int cvId) {
		return this.cvImagesService.add(cvId, imageFile);
	}
	
	
	
	@PostMapping("/update")
	public Result update(@RequestBody MultipartFile imageFile, @RequestParam int cvImageId ) {
		return this.cvImagesService.update(cvImageId, imageFile);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int cvImageId) {
		
		return this.cvImagesService.delete(cvImageId);
	}

}
