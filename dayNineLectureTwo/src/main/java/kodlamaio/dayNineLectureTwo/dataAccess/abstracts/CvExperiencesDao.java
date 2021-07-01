package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.CvExperiences;

public interface CvExperiencesDao extends JpaRepository<CvExperiences, Integer>{

}
