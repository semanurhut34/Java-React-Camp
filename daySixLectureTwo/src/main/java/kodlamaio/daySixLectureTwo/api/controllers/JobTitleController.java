package kodlamaio.daySixLectureTwo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.daySixLectureTwo.business.abstracts.JobTitleService;
import kodlamaio.daySixLectureTwo.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/job_titles")
public class JobTitleController {

	
	private JobTitleService jobTitleService;

	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public List<JobTitle> getAll() {
		return this.jobTitleService.getAll();

	}

}
