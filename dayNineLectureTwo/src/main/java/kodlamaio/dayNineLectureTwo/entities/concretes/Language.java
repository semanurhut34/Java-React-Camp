package kodlamaio.dayNineLectureTwo.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
public class Language {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name = "iso")
	private String iso;
}
