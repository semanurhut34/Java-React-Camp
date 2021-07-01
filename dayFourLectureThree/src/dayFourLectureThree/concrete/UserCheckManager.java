package dayFourLectureThree.concrete;

import dayFourLectureThree.abstracts.UserCheckService;
import dayFourLectureThree.entities.Gamer;

public class UserCheckManager implements UserCheckService {


	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
