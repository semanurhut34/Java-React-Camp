package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.Employee;

@Service
public interface EmployeeService {
	 DataResult<List<Employee>> getAll();
	public boolean confirm(String email);
	Result save(Employee employee);

}
