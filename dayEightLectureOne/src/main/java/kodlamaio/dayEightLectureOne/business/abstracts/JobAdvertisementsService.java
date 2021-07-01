package kodlamaio.dayEightLectureOne.business.abstracts;


import java.util.List;
import org.springframework.stereotype.Service;



import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.entities.concretes.JobAdvertisements;
import kodlamaio.dayEightLectureOne.entities.dtos.JobAdvertisementsDto;


public interface JobAdvertisementsService {
	
	DataResult<List<JobAdvertisements>>getall();
	DataResult<List<JobAdvertisements>>getByIsActive();
	
	DataResult<List<JobAdvertisementsDto>>getByIsActiveAndApplicationDeadLineAfter();
	
	DataResult<List<JobAdvertisementsDto>>getByIsActiveAndEmployerId(int id);
	
	Result save(JobAdvertisements jobAdvertisements);
	
	

}
