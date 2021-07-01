package kodlamaio.dayEightLectureOne.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayEightLectureOne.business.abstracts.JobTitleService;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.JobTitle;


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
