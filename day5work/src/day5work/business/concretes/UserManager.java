package day5work.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5work.business.abstracts.AuthCheckService;
import day5work.business.abstracts.UserService;
import day5work.core.GoogleService;
import day5work.dataAccess.abstracts.UserDao;
import day5work.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleService googleService;
	private AuthCheckService authCheckService;

	public UserManager(UserDao userDao, GoogleService googleService, AuthCheckService authCheckService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
		this.authCheckService = authCheckService;
	}
	

//	public boolean checkEmailControl(User[] users, String eMail) {
//		 boolean check = false;
//		for (User user : users) {
//			if (user.getEmail() == eMail) {
//				System.out.println("Email zaten mevcut. ");
//				check = false;
//			} else {
//				System.out.println("Email kontrol edildi. ");
//				check = true;
//			}
//		}
//		return check;
//	}


	public void register(User user) {

		
		if (authCheckService.checkEmail(user, userDao.getAllEmails()) == true 
				&& authCheckService.checkFirstName(user) == true
				&& authCheckService.checkLastName(user) == true
				&& authCheckService.checkPassword(user) == true) {
			System.out.println("Sifre ve E-mail gecerli. Kayit yapildi: " + user.getFirstName());
			this.userDao.add(user);
			this.googleService.signInWithGoogle();
			
		}
		else {
			System.out.println("E-Mail adresi sistemde mevcuttur.");
		}
		

	}


	@Override
	public void signIn(User user, String eMail, String password) {
		if (eMail == user.getEmail() && password == user.getPassword()) {
			System.out.println("Bilgiler dogru. Giris yapildi.");
		} else {
			System.out.println("Giris basarisiz. Yanlis email ve sifre girdiniz.");
		}
		
	}	
		
		




}
