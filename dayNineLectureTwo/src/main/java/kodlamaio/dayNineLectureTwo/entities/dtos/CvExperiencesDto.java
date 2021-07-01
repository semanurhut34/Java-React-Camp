package kodlamaio.dayNineLectureTwo.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class CvExperiencesDto {
	@Min(1)
	private int cvId;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String workingPlace;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String position;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private LocalDate startAt;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private LocalDate endAt;
	
	
	
	
	

}
