package com.nvt.view;

import java.util.ArrayList;
import java.util.List;

import com.nvt.common.Iconfig;
import com.nvt.entity.Ticket;

public class TicketImp {
	InputData input = new InputData();
	
	List<Ticket> lstTicket = new ArrayList<Ticket>();
	public void showTicket(){
		for (Ticket ticket : lstTicket) {
			
		}
	}

	public Ticket addTicket(Ticket ticket) {
		int numberOfTicket = 0;
		int typeTicket;
		int stand;
	
		showTicket();
		System.out.println("Enter number of ticket");
		numberOfTicket = input.enterInteger("Enter number of ticket: ");
		ticket.setIdTicket(numberOfTicket);
		ticket.setNameMatch(input.enterString("Enter name of match"));
		ticket.setStatus(Iconfig.STATUS_TICKET_BUSY);
		stand = input.enterInteger("Enter 1 " + Iconfig.STAND_A + " Enter 2 "
				+ Iconfig.STAND_B + " Enter 3 " + Iconfig.STAND_C + " Enter 4 "
				+ Iconfig.STAND_D);

		switch (stand) {
		case 1: {
			ticket.setStand(Iconfig.STAND_A);
			typeTicket = input.enterInteger("Enter 1 "
					+ Iconfig.TYPE_TICKET_VIP + " Enter 2 "
					+ Iconfig.TYPE_TICKET_NORMAL);
			if (typeTicket == 1) {
				ticket.setTypeOfTicket(Iconfig.TYPE_TICKET_VIP);
				ticket.setNumberOfChair(Iconfig.NUMBER_OF_A_VIP);
				ticket.setPriceTicket(Iconfig.PRICE_VIP);
			} else {
				ticket.setTypeOfTicket(Iconfig.TYPE_TICKET_NORMAL);
				ticket.setNumberOfChair(Iconfig.NUMBER_OF_A_NORMAL);
				ticket.setPriceTicket(Iconfig.PRIVE_NORMAL);
			}

			break;
		}
		case 2: {
			ticket.setStand(Iconfig.STAND_B);
			ticket.setTypeOfTicket(Iconfig.TYPE_TICKET_NORMAL);
			ticket.setNumberOfChair(Iconfig.NUMBER_OF_B);
			ticket.setPriceTicket(Iconfig.PRIVE_NORMAL);
			break;
		}
		case 3: {
			ticket.setStand(Iconfig.STAND_C);
			ticket.setTypeOfTicket(Iconfig.TYPE_TICKET_NORMAL);
			ticket.setNumberOfChair(Iconfig.NUMBER_OF_C);
			ticket.setPriceTicket(Iconfig.PRIVE_NORMAL);
			break;
		}
		case 4: {
			ticket.setStand(Iconfig.STAND_D);
			ticket.setTypeOfTicket(Iconfig.TYPE_TICKET_NORMAL);
			ticket.setNumberOfChair(Iconfig.NUMBER_OF_D);
			ticket.setPriceTicket(Iconfig.PRIVE_NORMAL);
			break;
		}

		default:
			System.out.println("Your value invalid.");
			break;
		}
		
		return ticket;
	}
}
