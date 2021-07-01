package dayFourLectureTwo.concrete;

import dayFourLectureTwo.abstracts.CustomerCheckService;
import dayFourLectureTwo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
