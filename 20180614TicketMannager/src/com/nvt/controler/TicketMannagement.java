package com.nvt.controler;

import java.util.ArrayList;
import java.util.List;

import com.nvt.common.Iconfig;
import com.nvt.entity.Customer;
import com.nvt.entity.StandA;
import com.nvt.entity.StandB;
import com.nvt.entity.Ticket;
import com.nvt.model.StadiumDAO;
import com.nvt.view.ShowImp;
import com.nvt.view.StadiumImp;

public class TicketMannagement {
	public static void main(String[] args) {
		int optionInt;
		String optionString;
		boolean flagOut = true;
		List<StandA> lstStandA = new ArrayList<StandA>(Iconfig.NUMBER_OF_A);
		List<StandB> lstStandB = new ArrayList<StandB>(Iconfig.NUMBER_OF_B);
		StadiumImp stadiumImp = new StadiumImp();
		StadiumDAO stadiumDAO = new StadiumDAO();
		ShowImp showImp = new ShowImp();
		StandA standA = null;
		StandB standB = null;
		Ticket ticket = null;
		Customer customer = null;
		do {
			showImp.showMenu();
			optionInt = showImp.enterOption();
			switch (optionInt) {
			case Iconfig.MENU_TICKETING: {
				showImp.showStand();
				optionString = showImp.enterStand();
				switch (optionString.toUpperCase()) {
				case Iconfig.STAND_A: {
					boolean flag = false;
					stadiumImp.showChairBoughtA(lstStandA);
					standA = new StandA();
					ticket = new Ticket();
					customer = new Customer();
					standA = stadiumImp.addStandA(lstStandA, standA, ticket,
							customer);
					flag = stadiumDAO.buyTicketStandA(lstStandA, standA);
					if (flag == true) {
						showImp.showMEssage("Buy Success");
					} else {
						showImp.showMEssage("Buy failed");
					}
					break;
				}
				case Iconfig.STAND_B: {
					boolean flag = false;
					standB = new StandB();
					ticket = new Ticket();
					customer = new Customer();
					stadiumImp.showChairBoughtB(lstStandB);
					standB = stadiumImp.addStandB(lstStandB, customer, standB,
							ticket);
					flag = stadiumDAO.buyTicketStandB(lstStandB, standB);
					if (flag == true) {
						showImp.showMEssage("Buy Success ");
					} else {
						showImp.showMEssage("Buy failded");
					}

					break;
				}

				default:
					System.out.println("Error");
					break;
				}
				break;
			}
			case Iconfig.MENU_SHOW_INFO_STAND: {
				showImp.showStand();
				optionString = showImp.enterStand();
				switch (optionString.toUpperCase()) {
				case Iconfig.STAND_A:
					stadiumImp.showStandA(lstStandA);
					break;
				case Iconfig.STAND_B:
					stadiumImp.showStandB(lstStandB);

				default:
					System.out.println("Error");
					break;
				}
				break;
			}
			case Iconfig.MENU_SWAP_TICKET: {
				showImp.showStand();
				optionString = showImp.enterStand();
				switch (optionString.toUpperCase()) {
				case Iconfig.STAND_A: {
					boolean flag = false;
					stadiumImp.showChairBoughtA(lstStandA);
					standA = stadiumImp.swapStandA(lstStandA, standA, ticket);
					flag = stadiumDAO.swapStandA(lstStandA, standA, ticket);
					if (flag == true) {
						showImp.showMEssage("Swap success");
					} else {
						showImp.showMEssage("Swap faild");
					}
					break;
				}
				case Iconfig.STAND_B: {
					boolean flag = false;
					int idTicketBefor;
					int idTicketAfter;
					stadiumImp.showChairBoughtB(lstStandB);
					idTicketBefor = stadiumImp.getIdTicketBefor(lstStandB);
					idTicketAfter = stadiumImp.getIdTicketAfter(lstStandB);
					flag = stadiumDAO.swapStandB(lstStandB, ticket,
							idTicketBefor, idTicketAfter);

					if (flag == true) {
						showImp.showMEssage("Swap ok");
					} else {
						showImp.showMEssage("Swap not ok");
					}

					break;
				}

				default:
					System.out.println("Error!!!");
					break;
				}
			}
			case Iconfig.MENU_PAY_TICKET: {
				showImp.showStand();
				optionString = showImp.enterStand();
				switch (optionString.toUpperCase()) {
				case Iconfig.STAND_A: {
					boolean flag = false;
					int idTicket;
					idTicket = stadiumImp.payTicketA(lstStandA, standA);
					flag = stadiumDAO.payStandA(lstStandA, standA, idTicket);
					if (flag == true) {
						System.out.println("Pay success");
					} else {
						System.out.println("Pay faild");
					}
					break;
				}
				case Iconfig.STAND_B: {
					boolean flag = false;
					int idTicket;
					idTicket = stadiumImp.payTicketB(lstStandB, standB);
					flag = stadiumDAO.payStandB(lstStandB, standB, idTicket);
					if (flag == true) {
						System.out.println("Pay success");
					} else {
						System.out.println("Pay faild");
					}
					break;
				}

				default:
					System.out.println("Stand do not exist");
					break;
				}
				break;
			}

			case Iconfig.MENU_REVENUE: {
				showImp.showStand();
				optionString = showImp.enterStand();
				switch (optionString.toUpperCase()) {
				case Iconfig.STAND_A: {
					double revenue;
					revenue = stadiumDAO.revenueA(lstStandA, standA);
					showImp.showMEssage("All revenue = " + revenue + "$");
					break;
				}
				case Iconfig.STAND_B: {
					double verenue;
					verenue = stadiumDAO.revenueB(lstStandB, standB);
					showImp.showMEssage("All revenue = " + verenue + "$");
					break;
				}

				default:
					System.out.println("error");
					break;
				}

				break;
			}
			default:
				System.out.println("Error");
				break;
			}
		} while (flagOut);
	}
}
