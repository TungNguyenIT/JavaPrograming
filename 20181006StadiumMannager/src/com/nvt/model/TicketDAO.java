package com.nvt.model;

import java.util.List;

import com.nvt.entity.Ticket;

public class TicketDAO {
	public boolean addTicket(List<Ticket> lstTicket, Ticket ticket){
		int length = 0;
		boolean flag = false;
		length = lstTicket.size();
		lstTicket.add(ticket);
		if(lstTicket != null && lstTicket.size() == (length+1)){
			flag = true;
		}
		return flag;
	}
}
