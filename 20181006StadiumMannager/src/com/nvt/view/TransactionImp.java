package com.nvt.view;

import java.util.List;

import com.nvt.common.Iconfig;
import com.nvt.entity.Person;
import com.nvt.entity.Ticket;
import com.nvt.entity.Transaction;

public class TransactionImp {
	InputData input = new InputData();
	PersionImp persionImp = new PersionImp();
	TicketImp ticketImp = new TicketImp();

	public Transaction Ticketing(Transaction transaction, Person person,
			Ticket ticket) {
		ticket = ticketImp.addTicket(ticket);
		person = persionImp.addPerson(transaction, person);
		transaction.setTicket(ticket);
		transaction.setPerson(person);

		return transaction;
	}
}
