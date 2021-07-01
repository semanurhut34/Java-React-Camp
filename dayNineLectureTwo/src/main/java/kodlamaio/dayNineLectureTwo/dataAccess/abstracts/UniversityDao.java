package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.University;

public interface UniversityDao extends JpaRepository<University, Integer>{
	
	
	List<University> findByCityId(int id);

}
