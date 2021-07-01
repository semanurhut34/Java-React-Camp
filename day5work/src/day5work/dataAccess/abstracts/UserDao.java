package day5work.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import day5work.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	
	ArrayList<String> getAllEmails();
	
	List<User> getAll();
		
}
