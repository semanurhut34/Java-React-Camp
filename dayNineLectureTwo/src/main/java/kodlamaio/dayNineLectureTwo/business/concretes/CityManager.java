package kodlamaio.dayNineLectureTwo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.dayNineLectureTwo.business.abstracts.CityService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.ErrorDataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.SuccessDataResult;
import kodlamaio.dayNineLectureTwo.dataAccess.abstracts.CityDao;
import kodlamaio.dayNineLectureTwo.entities.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;
    @Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> findAll() {
		return new SuccessDataResult<List<City>>
		(cityDao.findAll(), "Listelendi.");
	}

	@Override
	public DataResult<City> finById(int id) {
		City city = this.cityDao.findById(id).orElse(null);
		if(city == null) {
			return new ErrorDataResult<City>("Şehir bulunamadı. ");
		}
		return new SuccessDataResult<City> 
		(city);
	}

}
