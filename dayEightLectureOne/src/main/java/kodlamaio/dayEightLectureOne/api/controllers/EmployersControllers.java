package kodlamaio.dayEightLectureOne.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayEightLectureOne.business.abstracts.EmployerService;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.Employer;
import kodlamaio.dayEightLectureOne.entities.dtos.EmployerSaveDto;

@RestController
@RequestMapping("api/employers")
public class EmployersControllers {
	
	
	private EmployerService employerService;
@Autowired
public EmployersControllers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}


@GetMapping("/getall")
public DataResult<List<Employer>> getAll(){
	return this.employerService.getAll();
}

	
	@PostMapping("/save")
	public Result save(@RequestBody EmployerSaveDto employerSaveDto) {
		
		Employer employer=new Employer();
		employer.setCompanyName(employerSaveDto.getCompanyName());
		employer.setPhoneNumber(employerSaveDto.getPhoneNumber());
		employer.setWebAddress(employerSaveDto.getWebAddress());
		employer.setEmail(employerSaveDto.getEmail());
		employer.setPassword(employerSaveDto.getPassword());
		return this.employerService.save(employer);
		
		
	}
	
	
}
