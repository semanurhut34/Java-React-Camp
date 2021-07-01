import java.time.LocalDate;

import dayFourLectureThree.adapters.MernisServiceAdapters;
import dayFourLectureThree.concrete.CampaignManager;
import dayFourLectureThree.concrete.GameManager;
import dayFourLectureThree.concrete.GamerManager;
import dayFourLectureThree.concrete.SaleManager;
import dayFourLectureThree.entities.Campaign;
import dayFourLectureThree.entities.Game;
import dayFourLectureThree.entities.Gamer;
import dayFourLectureThree.entities.Sale;

public class Main {

	public static void main(String[] args) {
		
	
		Gamer gamer = new Gamer(1 , "Semanur","Hut",2001 ,339081665L);
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapters());
		gamerManager.verification(gamer);
		
		
		Campaign campaign = new Campaign(1, "Welcome Summer", 10,LocalDate.of(2021, 5, 1),LocalDate.of(2021,5,30),false);
		CampaignManager campaignManager = new CampaignManager();		
		campaignManager.update(campaign);
			
		Game game= new Game(1, "Euro Track", 1000, campaign);
		GameManager gameManager = new GameManager();
		gameManager.add(game.getGameName());
		gameManager.delete(game.getGameName());
		System.out.print("\n");
		
		Sale sale = new Sale(gamer,game,LocalDate.of(2021,4,1));
		
		SaleManager saleManager = new SaleManager(campaign);
		saleManager.buy(sale);
		saleManager.giveBack(sale);	
		
	}

}
