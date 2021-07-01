package kodlamaio.daySevenLectureThree.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.daySevenLectureThree.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
