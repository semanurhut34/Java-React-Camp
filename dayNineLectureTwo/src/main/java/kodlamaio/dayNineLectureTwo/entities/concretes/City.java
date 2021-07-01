package kodlamaio.dayNineLectureTwo.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "cities")
//@PrimaryKeyJoinColumn(name = "id")
public class City {
	
	@Id
	@Column(name= "id")
	private int id;
	
	@Column(name = "name")
	@NotBlank(message = "Boşluk bırakmayınız.")
	private String cityName; 
}