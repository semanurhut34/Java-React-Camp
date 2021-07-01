package kodlamaio.daySevenLectureThree.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "employers")
@PrimaryKeyJoinColumn(name = "id") //foreign key
public class Employer extends User{

	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "company_name")
	@NotBlank(message = "Boş bırakılamaz. ")
	private String companyName;
	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "web_address")
	private String webAddress;
	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "phone_number")
	private String phoneNumber;

}
