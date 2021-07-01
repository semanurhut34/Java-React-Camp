package dayFourLectureThree.concrete;

import dayFourLectureThree.abstracts.BaseManager;
import dayFourLectureThree.abstracts.SalesService;
import dayFourLectureThree.entities.Campaign;
import dayFourLectureThree.entities.Sale;

public class SaleManager implements BaseManager, SalesService {

	private Campaign campaign;
	
	public SaleManager(Campaign campaign) {
		super();
		this.campaign = campaign;
	}

	@Override
	public void buy(Sale sale) {
		
		if(campaign.isCampaign() == true) {
		System.out.println(sale.getGame().getGameName() + " has been bought successfully for "+ sale.getNewPrice()
		+ " by " + sale.getGamer().getFirstName() + sale.getGamer().getLastName()); 
		}else {
			System.out.println(sale.getGame().getGameName()  +" has been bought successfully for" + sale.getGame().getGamePrice() + " by"
					+ sale.getGamer().getFirstName() );
		}
	}

	@Override
	public void giveBack(Sale sale) {
		System.out.println(sale.getGame().getGameName() + " has been returned back successfully "+ sale.getNewPrice()
		+ " by " + sale.getGamer().getFirstName() + sale.getGamer().getLastName());
	}
	
	@Override
	public void add(String message) {

		System.out.println("Sale has been added: " + message);

	}

	@Override
	public void update(String message) {

		System.out.println("Sale has been updated: " + message);
	}

	@Override
	public void delete(String message) {

		System.out.println("Sale has been deleted: " + message);
	}



}
