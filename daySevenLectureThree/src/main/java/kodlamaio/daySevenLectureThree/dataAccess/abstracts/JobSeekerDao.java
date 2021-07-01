package kodlamaio.daySevenLectureThree.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.daySevenLectureThree.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer>{

}
