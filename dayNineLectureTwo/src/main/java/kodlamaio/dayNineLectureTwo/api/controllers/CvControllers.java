package kodlamaio.dayNineLectureTwo.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.dayNineLectureTwo.business.abstracts.CvService;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;
import kodlamaio.dayNineLectureTwo.core.utilities.results.Result;
import kodlamaio.dayNineLectureTwo.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cvControllers")
public class CvControllers {
	
	private CvService cvService;
    @Autowired
	public CvControllers(CvService cvService) {
		super();
		this.cvService = cvService;
	}
    @GetMapping("/getall")
    public DataResult<List<Cv>> getAll(){
    	return this.cvService.getAll() ;
    	
    }
    @GetMapping("/findByJobSeekerId")
    public DataResult<List<Cv>> findByJobSeekerId(int id) {
    	return this.findByJobSeekerId(id);
    }
    
    @PostMapping("/add")
	public Result add(@RequestBody Cv cv) {
		
		return this.cvService.add(cv);
	}
	
	
	
	@PostMapping("/update")
	public Result update(@RequestBody Cv cv) {
		
		return this.cvService.update(cv);
	}
	
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Cv cv) {
		
		return this.cvService.delete(cv);
	}
	
    
    

}
