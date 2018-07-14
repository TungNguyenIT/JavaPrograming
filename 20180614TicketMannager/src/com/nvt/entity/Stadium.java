package com.nvt.entity;

import java.util.List;

public class Stadium {
	private List<String> standA;
	private List<String> standB;
	private List<String> standC;
	private List<String> standD;
	private Ticket ticket;
	private Customer customer;

	public List<String> getStandA() {
		return standA;
	}

	public void setStandA(List<String> standA) {
		this.standA = standA;
	}

	public List<String> getStandB() {
		return standB;
	}

	public void setStandB(List<String> standB) {
		this.standB = standB;
	}

	public List<String> getStandC() {
		return standC;
	}

	public void setStandC(List<String> standC) {
		this.standC = standC;
	}

	public List<String> getStandD() {
		return standD;
	}

	public void setStandD(List<String> standD) {
		this.standD = standD;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
