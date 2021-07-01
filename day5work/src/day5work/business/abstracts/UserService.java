package day5work.business.abstracts;

import day5work.entities.concretes.User;

public interface UserService {

	void register(User user);
	void signIn(User user , String eMail, String password);
}
