package kodlamaio.dayNineLectureTwo.entities.concretes;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_foreign_languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
public class CvForeignLanguages {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name= "language_id")
	private Language language;
	
	@Column(name = "level")
	private int level;
	
	@Column(name= "created_at")
	private LocalDate createdAt= LocalDate.now();
	
	@Column(name = "is_actived")
	private boolean isActived = true;
	
	@Column(name = "is_deleted")
	private boolean isDeleted = false;
	
	@ManyToOne
	@JoinColumn(name="cv_id",nullable = false)
	private Cv cv;
	
}
