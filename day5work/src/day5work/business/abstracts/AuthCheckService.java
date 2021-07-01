package day5work.business.abstracts;

import java.util.ArrayList;

import day5work.entities.concretes.User;

public interface AuthCheckService {
	
	boolean checkFirstName(User user);
    boolean checkLastName(User user);
    boolean checkPassword(User user);
    boolean checkEmail(User user, ArrayList<String> emails);

}
