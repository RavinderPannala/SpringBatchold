package org.practice.spring.model;

public class Report {

	private String Date;
	private String Impressions;
	private String Clicks;
	private String Earning;

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getImpressions() {
		return Impressions;
	}

	public void setImpressions(String impressions) {
		Impressions = impressions;
	}

	public String getClicks() {
		return Clicks;
	}

	public void setClicks(String clicks) {
		Clicks = clicks;
	}

	public String getEarning() {
		return Earning;
	}

	public void setEarning(String earning) {
		Earning = earning;
	}

	public Report(String date, String impressions, String clicks, String earning) {
		super();
		Date = date;
		Impressions = impressions;
		Clicks = clicks;
		Earning = earning;
	}

	public Report() {
		super();
	}

	@Override
	public String toString() {
		return "Report [Date=" + Date + ", Impressions=" + Impressions + ", Clicks=" + Clicks + ", Earning=" + Earning
				+ "]";
	}

}