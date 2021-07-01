package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.SectionService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.entities.concretes.Section;

@RestController
@RequestMapping("/api/section")
public class SectionControllers {
	
	private SectionService sectionService;
    @Autowired
	public SectionControllers(SectionService sectionService) {
		super();
		this.sectionService = sectionService;
	}
    @GetMapping("/getall")
    public DataResult<List<Section>> getAll(){
    	return sectionService.findAll();
    }
    @GetMapping("/getByFacultyId/{id}")
    public DataResult<List<Section>>findByFacultyId(@PathVariable("id") Integer id){
        return sectionService.findByFacultyId(id);
    }
	

}
