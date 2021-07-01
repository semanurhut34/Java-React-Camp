package kodlamaio.dayEightLectureOne.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayEightLectureOne.entities.concretes.VerificationCode;



public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{

}
