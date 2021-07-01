package kodlamaio.dayEightLectureOne.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "verification_codes")
@PrimaryKeyJoinColumn(name = "id")
public class VerificationCode  extends User{
	
	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "code")
	private String code;
	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "is_verified")
	private boolean isVerified;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verified_date")
	private Date verifiedDate;


	
}
