package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.FacultyService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorDataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.FacultyDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Faculty;

@Service
public class FacultyManager implements FacultyService{
     
	private FacultyDao facultyDao;
    @Autowired
	public FacultyManager(FacultyDao facultyDao) {
		super();
		this.facultyDao = facultyDao;
	}

	@Override
	public DataResult<List<Faculty>> findAll() {
		return new SuccessDataResult<List<Faculty>>
		(this.facultyDao.findAll(), "Listelendi");
	}

	@Override
	public DataResult<List<Faculty>> findByUniversityId(int id) {
		List<Faculty>  faculty= this.facultyDao.findByUniversityId(id);
		if (faculty.isEmpty()) {
			return new ErrorDataResult<List<Faculty>>("Fakülte bulunamadı.");
		}
		return new SuccessDataResult<List<Faculty>>
		(faculty);
	}

}
