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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_cover_letters")
public class CvCoverLetters {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "created_at")
	private LocalDate createdAt =LocalDate.now();
	
	@Column (name = "is_active")
	private boolean is_active = true;
	
	@Column(name = "is_deleted")
	private boolean is_deleted = false;
	
	@ManyToOne
	@JoinColumn(name="cv_id",nullable = false)
	private Cv cv;

}
