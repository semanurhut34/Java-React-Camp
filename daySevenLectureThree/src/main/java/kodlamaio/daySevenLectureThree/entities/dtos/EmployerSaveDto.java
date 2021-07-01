package kodlamaio.daySevenLectureThree.entities.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class EmployerSaveDto {

	
	@NotBlank(message = "Boş bırakılamaz. ")
	private String companyName;
	@NotBlank(message = "Boş bırakılamaz. ")
	private String webAddress;
	@NotBlank(message = "Boş bırakılamaz. ")
	private String phoneNumber;
	@NotBlank(message = "Boş bırakılamaz.")
	private String email;
	@NotBlank(message = "Boş bırakılamaz.")
	private String password;
	
	
}
