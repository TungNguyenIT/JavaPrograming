package com.nvt.entity;

public class Ticket {
	private int idTicket;
	private String nameMatch;
	private String typeOfTicket;
	private double priceTicket;
	private double timeStart;
	private int numberOfChair;
	private String stand;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNameMatch() {
		return nameMatch;
	}

	public void setNameMatch(String nameMatch) {
		this.nameMatch = nameMatch;
	}

	public String getStand() {
		return stand;
	}

	public void setStand(String stand) {
		this.stand = stand;
	}

	public int getNumberOfChair() {
		return numberOfChair;
	}

	public void setNumberOfChair(int numberOfChair) {
		this.numberOfChair = numberOfChair;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public String getTypeOfTicket() {
		return typeOfTicket;
	}

	public void setTypeOfTicket(String typeOfTicket) {
		this.typeOfTicket = typeOfTicket;
	}

	public double getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(double priceTicket) {
		this.priceTicket = priceTicket;
	}

	public double getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(double timeStart) {
		this.timeStart = timeStart;
	}

}
