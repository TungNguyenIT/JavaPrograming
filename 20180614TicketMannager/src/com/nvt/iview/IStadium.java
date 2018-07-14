package com.nvt.iview;

import java.util.List;

import com.nvt.entity.Customer;
import com.nvt.entity.StandA;
import com.nvt.entity.StandB;
import com.nvt.entity.Ticket;

public interface IStadium {
	public abstract StandA addStandA(List<StandA> lstStandA, StandA standA,Ticket ticket, Customer customer);

	public abstract StandB addStandB(List<StandB> lstStandB, Customer customer,
			StandB standB, Ticket ticket);

	public abstract StandA swapStandA(List<StandA> lstStandA, StandA standA,
			Ticket ticket);

	public abstract int getIdTicketBefor(List<StandB> lstStandB);

	public abstract int getIdTicketAfter(List<StandB> lstStandB);

	public abstract int payTicketA(List<StandA> lstStandA, StandA standA);

	public abstract int payTicketB(List<StandB> lstStandB, StandB standB);

	public abstract void showStandA(List<StandA> lstStandA);

	public abstract void showStandB(List<StandB> lstStandB);

	public abstract void showChairBoughtA(List<StandA> lstStandA);

	public abstract void showChairBoughtB(List<StandB> lstStandB);
}
