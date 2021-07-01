package kodlamaio.dayNineLectureTwo.entities.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class CvImagesDto {

	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String url;
	
	
}
