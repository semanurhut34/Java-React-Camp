package kodlamaio.dayEightLectureOne.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayEightLectureOne.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}
