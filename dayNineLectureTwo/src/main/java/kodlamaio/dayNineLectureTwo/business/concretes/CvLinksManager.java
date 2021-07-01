package kodlamaio.dayNineLectureTwo.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CvLinksService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CvLinksDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;
import kodlamaio.dayNineLectureTwo.entities.concretes.CvLinks;
import kodlamaio.dayNineLectureTwo.entities.dtos.CvLinkDto;

@Service
public class CvLinksManager implements CvLinksService{
	
	private CvLinksDao cvLinksDao;
    @Autowired
	public CvLinksManager(CvLinksDao cvLinksDao) {
		super();
		this.cvLinksDao = cvLinksDao;
	}

	@Override
	public Result add(CvLinkDto cvLinkDto) {
		CvLinks cvLinks  = new CvLinks();
		Cv cv = new Cv();
		cv.setId(cvLinkDto.getCvId());
		cvLinks.setCv(cv);
		cvLinks.setUrl(cvLinkDto.getUrl());
		cvLinks.setName(cvLinkDto.getName());
		this.cvLinksDao.save(cvLinks);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result update(CvLinkDto cvLinkDto) {
		CvLinks cvLinks  = new CvLinks();
		Cv cv = new Cv();
		cv.setId(cvLinkDto.getCvId());
		cvLinks.setCv(cv);
		cvLinks.setUrl(cvLinkDto.getUrl());
		cvLinks.setName(cvLinkDto.getName());
		this.cvLinksDao.save(cvLinks);
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public Result delete(CvLinks cvLinks) {
		this.cvLinksDao.delete(cvLinks);
		return new SuccessResult("Silindi.");
	}

}
