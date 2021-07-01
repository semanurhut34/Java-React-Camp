package dayFourLectureThree.adapters;

import dayFourLectureThree.abstracts.UserCheckService;
import dayFourLectureThree.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements UserCheckService{

	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula((gamer.getNationaltyId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfbirth());
		} catch (Exception e) {
			System.out.println("Dogrulama basarisiz");
		}
		return false;
	}

	
}
