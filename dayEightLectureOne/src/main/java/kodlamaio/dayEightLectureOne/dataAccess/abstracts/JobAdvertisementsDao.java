package kodlamaio.dayEightLectureOne.dataAccess.abstracts;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlamaio.dayEightLectureOne.entities.concretes.JobAdvertisements;
import kodlamaio.dayEightLectureOne.entities.dtos.JobAdvertisementsDto;

public interface JobAdvertisementsDao extends JpaRepository<JobAdvertisements, Integer> {
	
	

	List<JobAdvertisements> getByIsActive(boolean isActive);

	
	@Query("Select new kodlamaio.dayEightLectureOne.entities.dtos.JobAdvertisementsDto"
			+ "(jT.title,j.numberOfOpenPosition,j.applicationDeadLine,j.postingDate)"
			+ "From  Employer e inner join e.jobAdvertisements j inner join j.jobTitle jT where j.isActive='true' and j.applicationDeadLine>=NOW()")
	List<JobAdvertisementsDto> getByIsActiveAndApplicationDeadLineAfter();

	
	@Query("Select new kodlamaio.dayEightLectureOne.entities.dtos.JobAdvertisementsDto"
			+ "(jT.title,j.numberOfOpenPosition,j.applicationDeadLine,j.postingDate)"
			+ "From  Employer e inner join e.jobAdvertisements j inner join j.jobTitle jT where j.isActive='true' and j.applicationDeadLine>=NOW() and e.id=:id")
	List<JobAdvertisementsDto>getByIsActiveAndEmployerId(int id);
}
