package kodlamaio.dayNineLectureTwo.entities.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class CvProgrammingSkillDto {
	
	@Min(1)
	private int cvId;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String skillName;

}
