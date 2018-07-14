package com.nvt.imodel;

import java.util.List;

import com.nvt.entity.StandA;
import com.nvt.entity.StandB;
import com.nvt.entity.Ticket;

public interface IStadium {
	public abstract boolean buyTicketStandA(List<StandA> lstStandA,
			StandA standA);

	public abstract boolean buyTicketStandB(List<StandB> lstStandB, StandB standB);
	
	public abstract boolean swapStandA(List<StandA> lstStandA, StandA standA,
			Ticket ticket);
	
	public abstract boolean swapStandB(List<StandB> lstStandB, Ticket ticket,
			int idTicketBefor, int idTicketAfter);
	
	public abstract boolean payStandA(List<StandA> lstStandA, StandA standA, int idTicket);
	
	public abstract boolean payStandB(List<StandB> lstStandB, StandB standB, int idTicket);
	
	public abstract double revenueA(List<StandA> lstStandA, StandA standA);
	
	public abstract double revenueB(List<StandB> lstStandB, StandB standB);
}
