package kodlamaio.daySevenLectureThree.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


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
public class User { // bu şekilde ilerleyeceğiz anladın mı .d :( hepsini böyle mi yapacağız :( TAMAM BEN YAZARIM BÖYLE OLUNCA HATA BERİYOR
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank //hem boş hem de null olamaz
	@Column(name = "id")
	private int id;
	@NotBlank(message = "Boş bırakılamaz. ")
	@Email(message = "Lütfen Geçerli Bir Mail Adresi Giriniz")
	@Column(name = "email_address")
	private String email;
	@NotBlank(message = "Boş bırakılamaz. ")
	@Column(name = "password")
	private String password;

}