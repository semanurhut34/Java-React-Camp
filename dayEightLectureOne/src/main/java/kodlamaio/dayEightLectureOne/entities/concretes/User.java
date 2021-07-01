package kodlamaio.dayEightLectureOne.entities.concretes;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;



import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Email(message = "Lütfen Geçerli Bir Mail Adresi Giriniz")
	@Column(name = "email_address", unique=true)
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@JsonIgnore
	@NotBlank(message = "passwordCheck cannot not blank")
	@Transient
	private String passwordCheck;
	
}