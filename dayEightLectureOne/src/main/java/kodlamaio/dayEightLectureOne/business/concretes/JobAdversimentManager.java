package kodlamaio.dayEightLectureOne.business.concretes;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlamaio.dayEightLectureOne.business.abstracts.JobAdvertisementsService;
import kodlamaio.dayEightLectureOne.core.utilities.results.DataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.Result;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessDataResult;
import kodlamaio.dayEightLectureOne.core.utilities.results.SuccessResult;
import kodlamaio.dayEightLectureOne.dataAccess.abstracts.JobAdvertisementsDao;
import kodlamaio.dayEightLectureOne.entities.concretes.JobAdvertisements;
import kodlamaio.dayEightLectureOne.entities.dtos.JobAdvertisementsDto;

@Service
public class JobAdversimentManager implements JobAdvertisementsService{

	
	private JobAdvertisementsDao jobAdvertisementsDao;
	
	@Autowired
	public JobAdversimentManager(JobAdvertisementsDao jobAdvertisementsDao) {
		super();
		this.jobAdvertisementsDao = jobAdvertisementsDao;
	}
	@Override
	public DataResult<List<JobAdvertisements>> getall() {
		return new SuccessDataResult<List<JobAdvertisements>>
		(this.jobAdvertisementsDao.findAll() ,"Listelendi.");
		
	}
	@Override
	public DataResult<List<JobAdvertisements>> getByIsActive() {
		return new SuccessDataResult<List<JobAdvertisements>>
		(this.jobAdvertisementsDao.getByIsActive(true));
		
	}
	@Override
	public DataResult<List<JobAdvertisementsDto>> getByIsActiveAndApplicationDeadLineAfter() {
		return new SuccessDataResult<List<JobAdvertisementsDto>>(this.jobAdvertisementsDao.getByIsActiveAndApplicationDeadLineAfter());
		
	}
	@Override
	public DataResult<List<JobAdvertisementsDto>> getByIsActiveAndEmployerId(int id) {
		return new SuccessDataResult<List<JobAdvertisementsDto>>(this.jobAdvertisementsDao.getByIsActiveAndEmployerId(id));
		
	}
	@Override
	public Result save(JobAdvertisements jobAdvertisements) {
		this.jobAdvertisementsDao.save(jobAdvertisements);
		return new SuccessResult("Data kaydedildi.");
	
	
}

}
