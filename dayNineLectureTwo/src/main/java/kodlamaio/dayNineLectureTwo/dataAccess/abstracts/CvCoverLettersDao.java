package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.CvCoverLetters;

public interface CvCoverLettersDao extends JpaRepository<CvCoverLetters, Integer>{

}
