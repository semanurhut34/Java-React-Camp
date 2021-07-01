package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.dayNineLectureTwo.entities.concretes.Section;

public interface SectionDao extends JpaRepository<Section, Integer> {
	
	List<Section> findByFacultyId(int id);
	
	

}
