package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.dayNineLectureTwo.business.abstracts.SectionService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorDataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.SectionDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Section;

@Service
public class SectionManager implements SectionService{
	
	private SectionDao sectionDao;
	
    @Autowired
	public SectionManager(SectionDao sectionDao) {
		super();
		this.sectionDao = sectionDao;
	}


	@Override
	public DataResult<List<Section>> findAll() {
		return new SuccessDataResult<List<Section>>
		(this.sectionDao.findAll(), "Listelendi.");
	}


	@Override
	public DataResult<List<Section>> findByFacultyId(int id) {
		List<Section>  section = this.sectionDao.findByFacultyId(id);
		if (section.isEmpty()) {
			return new ErrorDataResult<List<Section>>("Bölüm bulunamadı.");
		}
		return new SuccessDataResult<List<Section>>
		(section);
	}
	

}
