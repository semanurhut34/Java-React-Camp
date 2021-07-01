package kodlamaio.daySevenLectureThree.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers")
//@PrimaryKeyJoinColumn(name = "id")
public class JobSeeker extends User{
	
	
@NotBlank(message = "Boş bırakılamaz. ")
@Column(name = "first_name")
@NotBlank(message = "Boş bırakılamaz. ")
private String firstName;
@Column(name = "last_name")
@NotBlank(message = "Boş bırakılamaz. ")
private String lastName;
@Size(min = 11, max=11, message = "TCKimlik No 11 hane olmalıdır")
@Column(name = "identity_number")
@NotBlank(message = "Boş bırakılamaz. ")
private String identityNumber;
@Column(name = "birth_date")
@NotBlank(message = "Boş bırakılamaz. ")
private Date birthDate;


}
