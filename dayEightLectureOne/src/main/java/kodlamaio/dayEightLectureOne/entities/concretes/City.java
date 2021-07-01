package kodlamaio.dayEightLectureOne.entities.concretes;



import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "cities")
//@PrimaryKeyJoinColumn(name = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class City {
	
	
	
	@Id
	@Column(name= "id")
	
	@NotBlank(message = "Boşluk bırakmayınız.")
	private int id;
	
	
	@Column(name = "name")
	@NotBlank(message = "Boşluk bırakmayınız.")
	private String cityName; 
	
	
	@OneToMany(mappedBy = "city", cascade =CascadeType.ALL)
	private List<JobAdvertisements> jobAdvertisements;

}
