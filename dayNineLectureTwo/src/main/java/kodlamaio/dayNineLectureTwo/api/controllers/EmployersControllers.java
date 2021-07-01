package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.EmployerService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.Employer;
import kodlamaio.dayNineLectureTwo.entities.dtos.EmployerSaveDto;

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
		return this.employerService.save(employerSaveDto);
		
		
	}
	
	
}
