package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;

@Service
public class CvManager implements CvService {
	
	private CvDao cvDao;
	
    @Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findAll(), "Listelendi.");
	}

	@Override
	public DataResult<List<Cv>> findByJobSeekerId(int id) {
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findByJobSeekerId(id));
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result update(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public Result delete(Cv cv) {
		this.cvDao.delete(cv);
		return new SuccessResult("Güncellendi.");
	}

}
