package com.nvt.entity;

public class Ticket {
	private int idTicket;
	private double price;
	private String numberOfChair;
	private String nameMatch;
	private String timeStart;
	private String typeTicket;

	public String getTypeTicket() {
		return typeTicket;
	}

	public String getNumberOfChair() {
		return numberOfChair;
	}

	public void setNumberOfChair(String numberOfChair) {
		this.numberOfChair = numberOfChair;
	}

	public void setTypeTicket(String typeTicket) {
		this.typeTicket = typeTicket;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNameMatch() {
		return nameMatch;
	}

	public void setNameMatch(String nameMatch) {
		this.nameMatch = nameMatch;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

}
