package kodlamaio.dayNineLectureTwo.entities.concretes;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_images")
public class CvImages {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "is_active")
	private boolean isActive = true;
	
	@Column(name= "is_deleted")
	private boolean isDeleted = false;
	
	@Column(name = "created_at")
	private LocalDate createdAt = LocalDate.now();
	
	@OneToOne
	@JoinColumn(name="cv_id",nullable = false)
	private Cv cv;


		
	

	

}
