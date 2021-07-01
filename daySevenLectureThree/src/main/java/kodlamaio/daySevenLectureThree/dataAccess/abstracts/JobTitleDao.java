package kodlamaio.daySevenLectureThree.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.daySevenLectureThree.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

}
