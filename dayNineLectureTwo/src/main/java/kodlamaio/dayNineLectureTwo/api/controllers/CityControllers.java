package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.CityService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.City;

@RestController
@RequestMapping("/api/city")
public class CityControllers {
	
	private CityService cityService;
    @Autowired
	public CityControllers(CityService cityService) {
		super();
		this.cityService = cityService;
	}
    
    
    @GetMapping("/getall")
    public DataResult<List<City>> getAll() {
    	return cityService.findAll();
    }
    
    @GetMapping("/getById/{id}")
    public DataResult<City> findById(@PathVariable("id") Short id){
    	return cityService.finById(id);
    }
    

}
