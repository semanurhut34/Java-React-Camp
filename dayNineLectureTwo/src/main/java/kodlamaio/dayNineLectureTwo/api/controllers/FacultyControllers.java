package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.FacultyService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.Faculty;

@RestController
@RequestMapping("/api/faculty")
public class FacultyControllers {
	
	private FacultyService facultyService;
    @Autowired
	public FacultyControllers(FacultyService facultyService) {
		super();
		this.facultyService = facultyService;
	}
    @GetMapping("/getall")
    public DataResult<List<Faculty>> getAll(){
    	return facultyService.findAll();
    	
    }
    @GetMapping("/getfindByUniversityId/{id}")
    public DataResult<List<Faculty>> findByUniversityId(@PathVariable("id") Integer id){
        return facultyService.findByUniversityId(id);
    }

}
