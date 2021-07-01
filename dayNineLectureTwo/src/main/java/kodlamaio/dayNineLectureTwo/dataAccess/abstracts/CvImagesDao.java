package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.CvImages;

public interface CvImagesDao extends JpaRepository<CvImages, Integer>{
	
	

}
