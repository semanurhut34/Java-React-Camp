package day5work.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5work.dataAccess.abstracts.UserDao;
import day5work.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Hibernate veritabanýna eklendi: "+ user.getEmail());
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ArrayList<String> getAllEmails() {
		ArrayList<String> emails = new ArrayList<String>();
		for(User user: users) {
			emails.add(user.getEmail());
		}
		return emails;
	}


	

}
