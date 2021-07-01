package dayFourLectureThree.concrete;


import dayFourLectureThree.abstracts.CampaignService;
import dayFourLectureThree.entities.Campaign;

public class CampaignManager implements  CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign start: "+campaign.getStartTime());         
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated: "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign finished: "+campaign.getFinisTime());
		
	}

	
		
	

	
}
