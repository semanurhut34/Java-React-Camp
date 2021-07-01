package kodlamaio.daySevenLectureThree.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.daySevenLectureThree.business.abstracts.JobTitleService;
import kodlamaio.daySevenLectureThree.core.utilities.results.DataResult;
import kodlamaio.daySevenLectureThree.core.utilities.results.Result;
import kodlamaio.daySevenLectureThree.entities.concretes.JobTitle;


@RestController
@RequestMapping("/api/job_titles")
public class JobTitlesControllers {
	
	private JobTitleService jobTitleService;
    @Autowired
	public JobTitlesControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
    
    @GetMapping("/getall")
    public DataResult<List<JobTitle>> getAll(){
    	return this.jobTitleService.getAll();
    	}
//    
//	@GetMapping("/getall")
//	public DataResult<List<Product>> getAll(){
//		return this.productService.getAll();
//	}
    
    @PostMapping("/save")
    public Result save(@RequestBody JobTitle jobTitle) {
    	return this.jobTitleService.save(jobTitle);
    }
    
    
	

}
