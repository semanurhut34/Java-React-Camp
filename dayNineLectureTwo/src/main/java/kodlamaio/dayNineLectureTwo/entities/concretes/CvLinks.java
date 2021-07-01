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
@Table(name = "cv_links")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker"})
public class CvLinks {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "created_at")
	private LocalDate createdAt =LocalDate.now();
	
	@Column (name = "is_active")
	private boolean is_active = true;
	
	@Column(name = "is_deleted")
	private boolean is_deleted = false;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="cv_id",nullable = false)
	private Cv cv;
	
	
}
