package kodlamaio.dayNineLectureTwo.business.abstracts;


import java.util.List;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.JobAdvertisements;
import kodlamaio.dayNineLectureTwo.entities.dtos.JobAdvertisementsDto;


public interface JobAdvertisementsService {
	
	DataResult<List<JobAdvertisements>>getall();
	DataResult<List<JobAdvertisements>>getByIsActive();
	
	DataResult<List<JobAdvertisementsDto>>getByIsActiveAndApplicationDeadLineAfter();
	
	DataResult<List<JobAdvertisementsDto>>getByIsActiveAndEmployerId(int id);
	
	Result save(JobAdvertisements jobAdvertisements);
	
	

}
