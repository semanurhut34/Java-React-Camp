package kodlamaio.daySevenLectureThree.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "job_titles")
public class JobTitle extends User{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	@NotBlank(message = "Boş bırakılamaz. ")
	private String title;


}
