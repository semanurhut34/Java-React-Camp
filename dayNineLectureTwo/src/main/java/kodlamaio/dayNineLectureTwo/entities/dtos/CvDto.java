package kodlamaio.dayNineLectureTwo.entities.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class CvDto {
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String description;
	
	

}
