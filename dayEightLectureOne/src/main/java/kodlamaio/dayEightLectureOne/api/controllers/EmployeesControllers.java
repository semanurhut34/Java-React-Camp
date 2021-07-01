package kodlamaio.dayEightLectureOne.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.dayEightLectureOne.business.abstracts.EmployeeService;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeesControllers {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesControllers(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employee>> getall() {
		return this.employeeService.getAll();
	}

	@PostMapping("/save")
	public Result save(@RequestBody Employee employee) {

		return this.employeeService.save(employee);

	}

}
