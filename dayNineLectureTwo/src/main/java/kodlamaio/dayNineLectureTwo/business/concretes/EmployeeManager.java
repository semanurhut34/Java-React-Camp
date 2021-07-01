package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.EmployeeService;
import kodlamaio.dayNineLectureTwo.core.rules.Rules;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.EmployeeDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {


	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.findAll(),"Data listelendi");	
	}

	
	@Override
	public boolean confirm(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Result save(Employee employee) {
		Result result = Rules.run(Rules.checkFirstNameAndLastName(employee.getFirstName(), employee.getLastName()));
		if(! result.isSuccess()) {
			return new ErrorResult("Yanlış bilgiler girdiniz.");
		}
		 this.employeeDao.save(employee);
		return new SuccessResult("Employee eklendi");
		}
	}



