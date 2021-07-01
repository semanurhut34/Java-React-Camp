package dayFourLectureTwo.adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import dayFourLectureTwo.abstracts.CustomerCheckService;
import dayFourLectureTwo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client  = new KPSPublicSoapProxy();

		boolean result = false;
		try {
			result =  client.TCKimlikNoDogrula((customer.getNationalityId()), customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth()); 
		}catch ( RemoteException e) {
			
			System.out.println("Not a Valid person");
		}
	      return result;
	}

}
