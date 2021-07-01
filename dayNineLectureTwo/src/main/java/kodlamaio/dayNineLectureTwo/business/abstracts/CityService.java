package kodlamaio.dayNineLectureTwo.business.abstracts;

import java.util.List;

import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.City;

public interface CityService {
	
	
	DataResult<List<City>> findAll();
	DataResult<City> finById(int id);

}
