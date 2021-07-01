package kodlamaio.dayEightLectureOne.entities.concretes;




import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "job_advertisements")
//@PrimaryKeyJoinColumn(name = "id")
public class JobAdvertisements {
	
	
	@Id
	@Column(name = "id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "job_description")
	//@NotBlank(message = "Boş bırakılmaz.")
	private String jobDescription;
	
	@Column(name = "salary_scale_min")
	private int salaryScaleMin;
	
	@Column(name= "salary_scale_max")
	private int salaryScaleMax;
	
	@Column(name= "number_of_open_positions")
	
	private int numberOfOpenPosition;
	
	@Column(name = "application_dead_line")
	
	private LocalDate applicationDeadLine;
	
   //@CreationTimestamp
   //@Temporal(TemporalType.TIMESTAMP)
   @Column(name= "posting_date")
   private   LocalDate   postingDate = LocalDate.now();
   
   
   @Column(name = "is_active")
   private boolean isActive=true;
	
         
   @ManyToOne
   @JoinColumn(name= "city_id", nullable= false)
   private City city;
   
   @ManyToOne
   @JoinColumn(name="jobTitle_id", nullable = false)
   private JobTitle jobTitle;
   
   
   @ManyToOne
   @JoinColumn(name="employer_id", nullable=false)
   private Employer employer;
   
  
   
   
	

}
