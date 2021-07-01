package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	boolean existsByEmail (String Email);


	

}
