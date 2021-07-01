package day5work.business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5work.business.abstracts.AuthCheckService;
import day5work.entities.concretes.User;

public class AuthCheckManager implements AuthCheckService {

	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().length() < 2) {
			System.out.println("Ýsminiz 2 karakterden kýsa olamaz!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length() < 2) {
			System.out.println("Soyadýnýz 2 karakterden kýsa olamaz!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Parolanýz 6 karakterden kýsa olamaz! Tekrar deneyiniz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user , ArrayList<String> emails) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		//if (user.getEmail().matches(regex) && !emails.contains(user.getEmail()))
		if (matcher.matches() && !emails.contains(user.getEmail())) {
			System.out.println("Geçerli bir e-posta adresi girildi!");
			return true;
		} else {
			System.out.println("E-mail formatýna uymamaktadýr. Tekrar Deneyiniz!");
			return false;
		}
		
	}
}
