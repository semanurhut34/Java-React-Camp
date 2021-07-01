package dayFourLectureThree.entities;

import java.time.LocalDate;

import dayFourLectureThree.abstracts.Entity;

public class Sale implements Entity {

	private Gamer gamer;
	private Game game;
	private LocalDate date;

	public Sale() {
	}

	public Sale(Gamer gamer, Game game,LocalDate date) {
		super();
		this.gamer = gamer;
		this.game = game;
		
		this.date = date;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getNewPrice() {

		return game.getGamePrice() - game.getGamePrice() * game.getCampaign().getDiscountRate() / 100;
	}

}
