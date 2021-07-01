package kodlamaio.dayEightLectureOne.api.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayEightLectureOne.business.abstracts.JobAdvertisementsService;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.JobAdvertisements;
import kodlamaio.dayEightLectureOne.entities.dtos.JobAdvertisementsDto;

@RestController
@RequestMapping("api/job_advertiments")
public class JobAdvertisementsControllers {
	
	private JobAdvertisementsService jobAdvertisementsService;
    @Autowired
	public JobAdvertisementsControllers(JobAdvertisementsService jobAdvertisementsService) {
		super();
		this.jobAdvertisementsService = jobAdvertisementsService;
		
	}
    
    @GetMapping("/getall")
    public DataResult<List<JobAdvertisements>>getall() {
		return this.jobAdvertisementsService.getall();
	}
    
    @GetMapping("/isactive")
    public DataResult<List<JobAdvertisements>>getİsActive(){
    	return this.jobAdvertisementsService.getByIsActive();
    }
    
    @GetMapping("/getByIsActiveAndEmployerId")
    public DataResult<List<JobAdvertisementsDto>> getByIsActiveAndEmployerId(int id){
    	
    	
    	return this.jobAdvertisementsService.getByIsActiveAndEmployerId(id);
    }
    @GetMapping("/getByIsActiveAndApplicationDeadLineAfter")
    public DataResult<List<JobAdvertisementsDto>> getByIsActiveAndApplicationDeadLineAfter(){
    	
    	
    	return this.jobAdvertisementsService.getByIsActiveAndApplicationDeadLineAfter();
    }
    
    @PostMapping("/save")
    public Result save(@Valid @RequestBody JobAdvertisements jobAdvertisements)  {
    	return this.jobAdvertisementsService.save(jobAdvertisements);
    }
    

}
