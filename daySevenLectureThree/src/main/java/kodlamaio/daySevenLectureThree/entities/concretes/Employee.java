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
@Table (name = "employees")
@PrimaryKeyJoinColumn(name = "id")
public class Employee extends User{

	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "first_name")
	private String firstName;
	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "last_name")
	private String lastName;
	

}
