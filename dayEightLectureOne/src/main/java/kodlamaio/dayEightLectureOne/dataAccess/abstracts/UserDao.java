package kodlamaio.dayEightLectureOne.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayEightLectureOne.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	boolean existsByEmail (String Email);


	

}
