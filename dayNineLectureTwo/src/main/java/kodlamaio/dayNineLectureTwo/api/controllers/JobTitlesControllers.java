package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayNineLectureTwo.business.abstracts.JobTitleService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.JobTitle;


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
    
    @PostMapping("/save")
    public Result save(@RequestBody JobTitle jobTitle) {
    	return this.jobTitleService.save(jobTitle);
    }
    
    
	

}
