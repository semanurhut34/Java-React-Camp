package kodlamaio.dayNineLectureTwo.entities.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class CvLinkDto {
	

	@Min(1)
	private int cvId;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String url;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String name;

}
