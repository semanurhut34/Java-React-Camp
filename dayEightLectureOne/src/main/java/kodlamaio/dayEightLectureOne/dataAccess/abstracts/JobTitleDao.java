package kodlamaio.dayEightLectureOne.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayEightLectureOne.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{
  boolean existsByTitle(String title);
}
