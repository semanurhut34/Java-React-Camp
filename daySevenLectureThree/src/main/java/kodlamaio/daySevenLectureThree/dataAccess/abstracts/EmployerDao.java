package kodlamaio.daySevenLectureThree.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.daySevenLectureThree.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}
