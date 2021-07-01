package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.VerificationCode;



public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{

}
