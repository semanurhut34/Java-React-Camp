package kodlamaio.dayNineLectureTwo.entities.concretes;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
                                         

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class JobTitle {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	//@NotBlank(message = "Boş bırakılamaz. ")
	private String title;

	
	@OneToMany(mappedBy = "jobTitle", cascade =CascadeType.ALL)
	private List<JobAdvertisements> jobAdvertisements;

}
