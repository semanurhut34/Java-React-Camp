package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.Faculty;

public interface FacultyDao extends JpaRepository<Faculty, Integer>{
	
	List<Faculty> findByUniversityId(int id);

}
