package kodlamaio.dayNineLectureTwo.entities.concretes;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_experiences")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker"})
public class CvExperiences {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "working_place")
	private String workingPlace;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "start_at")
	private LocalDate startAt;
	
	@Column(name = "end_at")
	private LocalDate endAt;
	
	@Column(name = "created_at")
	private LocalDate createdAt = LocalDate.now();
	
	@Column(name = "is_active")
	private boolean isActive = true;
	
	@Column(name = "is_deleted")
	private boolean isDeleted = false;
	
	@ManyToOne
	@JoinColumn(name="cv_id",nullable = false)
	private Cv cv;

}
