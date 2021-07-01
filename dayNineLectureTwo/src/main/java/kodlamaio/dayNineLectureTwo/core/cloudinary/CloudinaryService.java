package kodlamaio.dayNineLectureTwo.core.cloudinary;

import java.util.Map;
import org.springframework.web.multipart.MultipartFile;
import kodlamaio.dayNineLectureTwo.core.utilities.results.DataResult;

public interface CloudinaryService {
	
	DataResult<Map> save(MultipartFile file);


}
