package dayFourLectureThree.entities;

import dayFourLectureThree.abstracts.Entity;

public class Game implements Entity{
	
	private int id;
	private String gameName;
	private double gamePrice;
	private Campaign campaign;
	
	public Game() {}

	public Game(int id, String gameName, double gamePrice, Campaign campaign) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setPrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	
	
	

}
