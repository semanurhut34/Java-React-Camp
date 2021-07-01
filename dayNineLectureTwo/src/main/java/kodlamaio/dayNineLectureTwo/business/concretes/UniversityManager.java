package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.UniversityService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorDataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.UniversityDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.University;

@Service
public class UniversityManager implements UniversityService{
   
	private UniversityDao universityDao;
	@Autowired
	public UniversityManager(UniversityDao universityDao) {
		super();
		this.universityDao = universityDao;
	}

	@Override
	public DataResult<List<University>> findAll() {
		return new SuccessDataResult<List<University>>
		(this.universityDao.findAll(), "Listelendi.");
	}

	@Override
	public DataResult<List<University>> finByCityId(int id) {
		List<University>  universities= this.universityDao.findByCityId(id);
		if (universities.isEmpty()) {
			return new ErrorDataResult<List<University>>("Üniversite bulunamadı.");
		}
		return new SuccessDataResult<List<University>>
		(universities);
	}

}
