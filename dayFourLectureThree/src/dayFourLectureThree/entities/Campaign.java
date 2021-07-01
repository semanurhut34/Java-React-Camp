package dayFourLectureThree.entities;

import java.time.LocalDate;

import dayFourLectureThree.abstracts.Entity;

public class Campaign implements Entity {

	private int campaignId;
	private String campaignName;
	private int discountRate;
	private double newPrice;
	private LocalDate startTime;
	private LocalDate finisTime;
	private boolean isCampaign;

	public Campaign() {
	}

	public Campaign(int campaignId, String campaignName, int discountRate, LocalDate startTime,
			LocalDate finisTime, boolean isCampaign) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.startTime = startTime;
		this.finisTime = finisTime;
		this.isCampaign = isCampaign;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getFinisTime() {
		return finisTime;
	}

	public void setFinisTime(LocalDate finisTime) {
		this.finisTime = finisTime;
	}

	public boolean isCampaign() {
		return isCampaign;
	}

	public void setCampaign(boolean isCampaign) {
		this.isCampaign = isCampaign;
	}

}
