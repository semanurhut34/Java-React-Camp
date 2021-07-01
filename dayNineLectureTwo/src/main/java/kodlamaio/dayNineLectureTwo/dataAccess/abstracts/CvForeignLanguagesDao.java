package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.CvForeignLanguages;

public interface CvForeignLanguagesDao extends JpaRepository<CvForeignLanguages, Integer>{

}
