package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.CvProgrammingSkills;

public interface CvProgrammingSkillsDao extends JpaRepository<CvProgrammingSkills, Integer>{

}
