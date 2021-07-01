package kodlamaio.dayNineLectureTwo.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "cv")
public class Cv {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "cv")
	@Column(name = "cv_cover_letters_id")
	@JsonIgnoreProperties("cv")
	private List<CvCoverLetters> cvCoverLetters;
	
	@OneToMany(mappedBy = "cv")
	@Column(name = "cv_experiences")
	@JsonIgnoreProperties("cv")
	private List<CvExperiences> cvExperiences;
	
	@OneToMany(mappedBy = "cv")
	@Column(name = "cv_foreign_languages")
	@JsonIgnoreProperties("cv")
	private List<CvForeignLanguages> cvForeingLanguages;
	
	
	@OneToMany(mappedBy = "cv")
	@Column(name = "cv_images_id")
	@JsonIgnoreProperties("cv")
	private List<CvImages> cvImages;
	
	@OneToMany(mappedBy = "cv")
	@Column(name = "cv_links_id")
	@JsonIgnoreProperties("cv")
	private List<CvLinks> cvLinks;
	
	@OneToMany(mappedBy = "cv")
	@Column(name= "cv_programming_skills_id")
	@JsonIgnoreProperties("cv")
	private List<CvProgrammingSkills> cvProgrammingSkills;
	
	@OneToMany(mappedBy = "cv")
	@Column(name= "cv_school_id")
	@JsonIgnoreProperties("cv")
	private List<CvSchool> cvSchool;
	
	@ManyToOne
	@JoinColumn(name= "job_seeker_id")
	private JobSeeker jobSeeker;
}
