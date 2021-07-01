package kodlamaio.dayNineLectureTwo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "universities")
public class University {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name= "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="city_id") // Many University to One City
	private City city;
	
	@Column(name = "status")
	private boolean status ;

}
