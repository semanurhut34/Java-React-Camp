package dayFourLectureThree.abstracts;

import dayFourLectureThree.entities.Sale;

public interface SalesService {
	
	void buy(Sale sale);
	void giveBack (Sale sale);

}
