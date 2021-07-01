package kodlamaio.dayNineLectureTwo.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import kodlamaio.dayNineLectureTwo.entities.concretes.Section;
import lombok.Getter;

@Getter
public class CvSchoolDto {
	
	@Min(1)
	private int cvId;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private LocalDate startAt;
	
	@NotBlank(message = "Boş bırakılamaz. ")
	private LocalDate endAt;
	
	@NotBlank(message = "Boş bırakılamaz.")
	private Section section;

}
