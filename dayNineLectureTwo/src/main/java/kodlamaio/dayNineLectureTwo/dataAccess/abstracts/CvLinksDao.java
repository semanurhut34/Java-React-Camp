package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.CvLinks;

public interface CvLinksDao extends JpaRepository<CvLinks, Integer>{

}
