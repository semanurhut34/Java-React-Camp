package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.dayNineLectureTwo.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

	
	
}
