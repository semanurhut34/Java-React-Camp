package kodlamaio.dayEightLectureOne.api.controllers;

import java.rmi.RemoteException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayEightLectureOne.business.abstracts.JobSeekerService;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;

import kodlamaio.dayEightLectureOne.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/job_seekers")
public class JobSeekersControllers {
	
	private JobSeekerService jobSeekerService;
	
    @Autowired
	public JobSeekersControllers(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getall(){
    	return  this.jobSeekerService.getAll();
    }
    
    @PostMapping("/save")
    public Result save(@RequestBody JobSeeker jobSeeker) throws RemoteException {
    	return this.jobSeekerService.save(jobSeeker);
    	 
    	
    }
    
    
	

}
