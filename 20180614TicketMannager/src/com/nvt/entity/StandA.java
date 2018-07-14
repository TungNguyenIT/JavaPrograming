package com.nvt.entity;

import java.io.Serializable;

public class StandA implements Serializable {
	private Customer customer;
	private Ticket ticket;
	private String timeIn;
	private String timeOut;
	private int amountTicketVip;
	private int amountTicketNor;

	public int getAmountTicketVip() {
		return amountTicketVip;
	}

	public void setAmountTicketVip(int amountTicketVip) {
		this.amountTicketVip = amountTicketVip;
	}

	public int getAmountTicketNor() {
		return amountTicketNor;
	}

	public void setAmountTicketNor(int amountTicketNor) {
		this.amountTicketNor = amountTicketNor;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public String getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
