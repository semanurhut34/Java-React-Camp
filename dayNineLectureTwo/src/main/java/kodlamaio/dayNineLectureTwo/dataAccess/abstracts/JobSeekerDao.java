package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.dayNineLectureTwo.entities.concretes.JobSeeker;


@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer>{

        boolean existsByIdentityNumber(Long identityNumber);
        
}
