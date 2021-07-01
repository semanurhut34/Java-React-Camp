package kodlamaio.dayEightLectureOne.entities.dtos;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import kodlamaio.dayEightLectureOne.entities.concretes.Employer;
import lombok.Getter;

import java.sql.Date;

@Getter
public class IsActiveCompanyNameDto extends Employer{
	@NotBlank(message = "Boş bırakılamaz.")
	private boolean isActive;
	@NotBlank(message = "Boş bırakılamaz.")
	private String companyName;
	
	@NotBlank(message = "Boş bırakılamaz.")
	private String jobTitle;
	@NotBlank(message = "Boş bırakılamaz.")
	private String jobDescription;
	@NotBlank(message = "Boş bırakılamaz.")
	private int numberOfOpenPosition;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	@NotBlank(message = "Boş bırakılamaz.")
	private Date postingDateTime;

	@NotBlank(message = "Boş bırakılamaz.")
	private Date applicationDeadLine;

}
