package kodlamaio.dayEightLectureOne.entities.dtos;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementsDto {
	//@NotBlank(message = "Boş bırakılamaz. ")
	private String jobTitle;
	@NotBlank(message = "Boş bırakılamaz. ")
	private int numberOfOpenPosition;
	@NotBlank(message = "Boş bırakılamaz. ")
	private LocalDate applicationDeadLine;
	@NotBlank(message = "Boş bırakılamaz. ")
	private LocalDate postingDate;
     

}
