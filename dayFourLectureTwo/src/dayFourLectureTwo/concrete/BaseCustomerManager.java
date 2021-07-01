package dayFourLectureTwo.concrete;

import dayFourLectureTwo.abstracts.CustomerService;
import dayFourLectureTwo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to the database. " +customer.getFirstName());
		
		
	}

}
