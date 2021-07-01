package kodlamaio.daySevenLectureThree.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.daySevenLectureThree.entities.concretes.VerificationCode;



public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{

}
