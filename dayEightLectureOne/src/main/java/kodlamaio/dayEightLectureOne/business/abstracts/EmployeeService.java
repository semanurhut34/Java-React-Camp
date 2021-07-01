package kodlamaio.dayEightLectureOne.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.Employee;

@Service
public interface EmployeeService {
	 DataResult<List<Employee>> getAll();
	public boolean confirm(String email);
	Result save(Employee employee);

}
