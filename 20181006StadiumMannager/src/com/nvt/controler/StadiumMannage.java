package com.nvt.controler;

import java.util.ArrayList;
import java.util.List;

import com.nvt.common.Iconfig;
import com.nvt.entity.Person;
import com.nvt.entity.Ticket;
import com.nvt.entity.Transaction;
import com.nvt.model.TransactionDAO;
import com.nvt.view.InputData;
import com.nvt.view.MenuImp;
import com.nvt.view.TransactionImp;

public class StadiumMannage {
	public static void main(String[] args) {
		int option;
		boolean flagOut = true;
		TransactionDAO transactionDAO = new TransactionDAO();
		TransactionImp transactionImp = new TransactionImp();
		
		InputData input = new InputData();
		MenuImp menuImp = new MenuImp();
		List<Transaction> lstTransaction = new ArrayList<Transaction>();
		Transaction transaction = null;
		Person person = null;
		Ticket ticket = null;
		
		do {
			menuImp.showMenu();
			option = input.enterInteger("Enter your option: ");
			switch (option) {
			case Iconfig.MENU_TICKETING:
			{
				transaction = new Transaction();
				person = new Person();
				ticket = new Ticket();
				boolean flag = false;
				transactionImp.Ticketing(transaction, person, ticket);
				flag = transactionDAO.Ticketing(lstTransaction, transaction);
				if(flag = true){
					menuImp.showMessage("Ticketing success!!!");
				}
				else{
					menuImp.showMessage("Ticketing fail!!!");
				}
				break;
			}

			default:
				break;
			}
		} while (flagOut);
	}
}
