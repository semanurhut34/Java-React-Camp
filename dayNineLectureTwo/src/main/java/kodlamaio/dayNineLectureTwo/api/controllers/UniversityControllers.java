package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.UniversityService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.University;

@RestController
@RequestMapping("/api/university")
public class UniversityControllers {
	
	private UniversityService universityService;
    @Autowired
	public UniversityControllers(UniversityService universityService) {
		super();
		this.universityService = universityService;
	}
    @GetMapping("/getall")
    public DataResult<List<University>> getAll(){
    	return universityService.findAll();
    }
    @GetMapping("/getfinByCityId/{id}")
    public DataResult<List<University>> finByCityId(@PathVariable("id") Integer id){
    	return universityService.finByCityId(id);
    }

}
