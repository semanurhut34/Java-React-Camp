package day5work.day5;

import day5work.business.abstracts.UserService;
import day5work.business.concretes.AuthCheckManager;
import day5work.business.concretes.UserManager;
import day5work.core.GoogleManagerAdapter;
import day5work.dataAccess.concretes.HibernateUserDao;
import day5work.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "hakan", "etlik", "hakan@gmail.com", "123456");
		User user2 = new User(1, "hakan", "tekin", "hakan@gmail.com", "123456");

		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter(),
				new AuthCheckManager());
		// UserManager userManager = new UserManager(new HibernateUserDao(),new
		// GoogleManagerAdapter());

		// UserService googleService = new UserManager(new HibernateUserDao(),new
		// GoogleManagerAdapter(),new AuthCheckManager());

		userService.register(user1);
		userService.register(user2);
		System.out.println("****************************************");

		userService.signIn(user1, "hakan@gmail.com", "123456");

	}

}
