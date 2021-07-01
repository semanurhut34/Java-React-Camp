package dayFourLectureThree.concrete;

import dayFourLectureThree.abstracts.BaseManager;
import dayFourLectureThree.abstracts.GamerService;
import dayFourLectureThree.abstracts.UserCheckService;
import dayFourLectureThree.entities.Gamer;

public class GamerManager implements BaseManager, GamerService {

	private UserCheckService userCheckService;

	public GamerManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	public UserCheckService getUserCheckService() {
		return userCheckService;
	}

	public void setUserCheckService(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void verification(Gamer gamer) {

		if (userCheckService.CheckIfRealPerson(gamer)) {
			System.out.println(
					"Verification has been done successfully "
			+ " " + gamer.getId() 
			+ " " + gamer.getFirstName() 
			+ " " + gamer.getLastName() 
			+ " " + gamer.getDateOfbirth() 
			+ " " + gamer.getNationaltyId());
		}
	}

	@Override
	public void add(String message) {

		System.out.println("Gamer has been added: " + message);

	}
	
	@Override
	public void update(String message) {

		System.out.println("Gamer has been updated: " + message);
	}

	@Override
	public void delete(String message) {

		System.out.println("Gamer has been deleted: " + message);
	}

	

}
