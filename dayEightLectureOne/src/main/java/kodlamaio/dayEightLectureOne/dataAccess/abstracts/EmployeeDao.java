package kodlamaio.dayEightLectureOne.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayEightLectureOne.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
