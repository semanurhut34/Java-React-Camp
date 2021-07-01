package kodlamaio.daySevenLectureThree.core.rules;

import kodlamaio.daySevenLectureThree.core.utilities.results.ErrorResult;
import kodlamaio.daySevenLectureThree.core.utilities.results.Result;
import kodlamaio.daySevenLectureThree.core.utilities.results.SuccessResult;


public abstract class Rules {
	 public static Result run(Result...rules) {
		 for(Result rule : rules) {
			 if(!rule.isSuccess()) {
				 return new ErrorResult(rule.getMessage());
			 }
		 }
		 return new SuccessResult();
	 }
	 	 public static Result checkPasswordExists(String password, String checkPassword) {
	 		 if(password.equals(checkPassword)) {
	 			 return new SuccessResult();
	 		 }
	 		 return new ErrorResult("Şifre hatalı.");
	 	 }
	 public static Result checkPaswordChracter(String password) {
		 if(password.length()<6) {
			 return new ErrorResult("Şifreniz en az 7 haneli olmalı.");
			 
		 }
		 return new SuccessResult();
	 }
	 public static Result checkIfEqualEmailAndDomain(String email, String website) {

	        String[] emailArr = email.split("@", 2); // @ gördüğünde böler 2 ayrı parçaya ve dizide tuttuk
	        String domain = website.substring(4, website.length()); // 4. karakterden başlayıp website uzunluğu kadar alır
	        // System.out.println(domain);

	        if (emailArr[1].equals(domain)) {
	            return new SuccessResult("Domain eklendi");
	        }
	        return new ErrorResult("Domain hatalı");
	    }
	 
	 public static Result checkFirstNameAndLastName(String firstName, String lastName) {
		 if(firstName.length()<2 && lastName.length()<2) {
			 return new ErrorResult("İsimler en az 3 haneli olmalı.");
		 }
		 return new SuccessResult();
	 }
	 
	 public static Result checkIdentityNumber(Long identityNumber) {
		 if(identityNumber.toString().length() == 11) {
			 return new ErrorResult("Tc kimlik no girişi hatalı");
		 }
		 return new SuccessResult();
	 }
	 
	 public static Result checkBirthDate(int birthDay) {
		 if(birthDay == 0) {
			 return new ErrorResult("Doğum tarihi hatalı girildi");
		 }
		 return new SuccessResult();
	 }
	 public static Result checkcompanyName(String companyName) {
			if(companyName.isEmpty() ) {
				return new ErrorResult("Şirket ismi hatalı.");
			}
			return new SuccessResult();
	 }
	 public static Result checkwebAdress(String webAdress ) {
			if(webAdress.isEmpty() ) {
				return new ErrorResult("Web adresi hatalı.");
			}return new SuccessResult();
	 }
	 public static Result checkphoneNumber(String phoneNumber) {
			if(phoneNumber.isEmpty()) {
					return new ErrorResult("Telefon numarası hatalı.");
				}return new SuccessResult();
			}
	
			
			
	 
	 
	 

}
