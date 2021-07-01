import java.time.LocalDate;

import dayFourLectureTwo.adapters.MernisServiceAdapters;
import dayFourLectureTwo.concrete.BaseCustomerManager;
import dayFourLectureTwo.concrete.NeroCustomerManager;
import dayFourLectureTwo.concrete.StarbucksCustomerManager;
import dayFourLectureTwo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer(1,"Semanur","Hut",2001, 33908166L));
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(new Customer(1,"Sema", "Hut", 2001, 33908166L));
		

	}

}
