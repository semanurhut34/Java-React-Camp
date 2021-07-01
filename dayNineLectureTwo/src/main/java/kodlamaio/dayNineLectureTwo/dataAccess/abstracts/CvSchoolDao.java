package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.CvSchool;

public interface CvSchoolDao extends JpaRepository<CvSchool, Integer> {

}
