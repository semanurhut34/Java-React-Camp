package kodlamaio.dayNineLectureTwo.entities.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import kodlamaio.dayNineLectureTwo.entities.concretes.Language;
import lombok.Getter;

@Getter
public class CvForeignLanguageDto {
	
	@Min(1)
	private int cvId;
	
	@NotBlank(message = "Boş bırakılamaz.")
	private Language language;
	
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private int level;
	
	
}
