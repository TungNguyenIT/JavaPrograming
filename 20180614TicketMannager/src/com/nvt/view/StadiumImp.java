package com.nvt.view;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.nvt.common.Iconfig;
import com.nvt.entity.Customer;
import com.nvt.entity.StandA;
import com.nvt.entity.StandB;
import com.nvt.entity.Ticket;
import com.nvt.iview.IStadium;
import com.nvt.model.NumberChairComparatorA;

public class StadiumImp implements IStadium{

	InputData input = new InputData();

	public StandA addStandA(List<StandA> lstStandA, StandA standA,
			Ticket ticket, Customer customer) {
		boolean flag = false;
		int idTicket;
		int typeTicket;
		int idCustomer;
		// Customer customer = new Customer();
		// Ticket ticket = new Ticket();
		System.out.println("Vip 001-200");
		idTicket = input.enterInteger("Enter ID ticket: ");
		idCustomer = input.enterInteger("Enter ID customer: ");
		for (StandA standA1 : lstStandA) {
			if (standA1.getTicket().getIdTicket() == idTicket) {
				System.out.println("This ticket was bought");
				flag = true;
			}
			if (standA1.getCustomer().getIdCustomer() == idCustomer) {
				System.out.println("THis person has bought");
				flag = true;
			}
		}
		if (flag == false) {
			int check = 0;
			ticket.setIdTicket(idTicket);
			typeTicket = input.enterInteger("Enter type ticket: 1 "
					+ Iconfig.TYPE_CHAIR_VIP + " 2: " + Iconfig.TYPE_CHAIR_NOR);
			if ((typeTicket == 1 && idTicket <= 200)
					|| (idTicket > 200 && typeTicket == 2)) {
				check = 1;
			}
			if (check == 1) {
				SimpleDateFormat format = new SimpleDateFormat(
						"HH:mm:ss dd/MM/yyyy");
				Date date = new Date();
				String showTimeIn = format.format(date.getTime());
				standA.setTimeIn(showTimeIn);
				ticket.setNameMatch(input.enterString("Enter name match: "));
				ticket.setTimeStart(input.enterString("Enter time start: "));
				ticket.setNumberOfChair(Iconfig.STAND_A + idTicket);
				customer.setIdCustomer(idCustomer);
				customer.setNameCustomer(input
						.enterString("Enter name customer: "));
				customer.setAddress(input.enterString("Enter Address: "));

				switch (typeTicket) {
				case 1: {
					
					ticket.setTypeTicket(Iconfig.TYPE_CHAIR_VIP);
					ticket.setPrice(Iconfig.PRICE_VIP);
					break;
				}
				case 2: {
					ticket.setTypeTicket(Iconfig.TYPE_CHAIR_NOR);
					ticket.setPrice(Iconfig.PRICE_NORMAL);
					break;
				}
				default:
					System.out.println("Error!");
					break;
				}
				standA.setTicket(ticket);
				standA.setCustomer(customer);

				return standA;
			} else {
				System.out.println("Vip only 001-200.Check id and type chair");
			}
		}
		return null;
	}

	public StandB addStandB(List<StandB> lstStandB, Customer customer,
			StandB standB, Ticket ticket) {
		int idTicket;
		int idCustomer;
		boolean flag = false;
		idTicket = input.enterInteger("Enter id ticket: ");
		idCustomer = input.enterInteger("Enter customer: ");
		for (StandB standB1 : lstStandB) {
			if (standB1.getTicket().getIdTicket() == idTicket) {
				System.out.println("This ticket was bought");
				flag = true;
			}
			if (standB1.getCustomer().getIdCustomer() == idCustomer) {
				System.out.println("This person has bought the ticket");
				flag = true;
			}
		}
		if (flag == false) {
			SimpleDateFormat format = new SimpleDateFormat(
					"HH:mm:ss dd/MM/yyyy");
			Date date = new Date();
			String showTimeIn = format.format(date.getTime());
			standB.setTimeIn(showTimeIn);
			ticket.setIdTicket(idTicket);
			ticket.setNameMatch(input.enterString("Enter name match: "));
			ticket.setNumberOfChair(Iconfig.STAND_B + idTicket);
			ticket.setPrice(Iconfig.PRICE_NORMAL);
			ticket.setTimeStart(input.enterString("Enter time start: "));
			ticket.setTypeTicket(Iconfig.TYPE_CHAIR_NOR);
			customer.setIdCustomer(idCustomer);
			customer.setNameCustomer(input.enterString("Enter name: "));
			customer.setAddress(input.enterString("Enter address: "));
			standB.setCustomer(customer);
			standB.setTicket(ticket);

			return standB;
		}

		return null;
	}

	public StandA swapStandA(List<StandA> lstStandA, StandA standA,
			Ticket ticket) {
		int check1 = 0;
		int check2 = 0;
		int idTicketBefor = 0;
		int idTicketAfter = 0;
		idTicketBefor = input.enterInteger("Enter id ticket want swap.");
		for (StandA standA1 : lstStandA) {
			if (standA1.getTicket().getIdTicket() == idTicketBefor) {
				check1 = 1;
			}
		}
		if (check1 == 1) {
			idTicketAfter = input.enterInteger("Enter new id Ticket: ");
			for (StandA standA1 : lstStandA) {
				if (standA1.getTicket().getIdTicket() != idTicketAfter) {
					check2 = 1;
				}
			}
		} else {
			System.out.println("This id is not exist");
		}

		if (check2 == 1) {
			int typeTicket = 0;
			int check = 0;
			ticket.setIdTicket(idTicketAfter);
			typeTicket = input.enterInteger("Enter type ticket: 1 "
					+ Iconfig.TYPE_CHAIR_VIP + " 2: " + Iconfig.TYPE_CHAIR_NOR);
			if ((typeTicket == 1 && idTicketAfter <= 200)
					|| (idTicketAfter > 200 && typeTicket == 2)) {
				check = 1;
			}
			if (check == 1) {
				ticket.setNameMatch(input.enterString("Enter name match: "));
				ticket.setTimeStart(input.enterString("Enter time start: "));
				ticket.setNumberOfChair(Iconfig.STAND_A + idTicketAfter);

				switch (typeTicket) {
				case 1: {
					
					ticket.setTypeTicket(Iconfig.TYPE_CHAIR_VIP);
					ticket.setPrice(Iconfig.PRICE_VIP);
					break;
				}
				case 2: {
					ticket.setTypeTicket(Iconfig.TYPE_CHAIR_NOR);
					ticket.setPrice(Iconfig.PRICE_NORMAL);
					break;
				}
				default:
					System.out.println("Error!");
					break;
				}
			} else {
				System.out.println("Vip only 001-200.Check id and type chair");
			}
			standA.setTicket(ticket);

			return standA;
		} else {
			System.out.println("New id ticket is already exist");
		}

		return null;
	}

	public int getIdTicketBefor(List<StandB> lstStandB) {
		int idTicketBefor;
		idTicketBefor = input.enterInteger("Enter id ticket want swap.");
		for (StandB standB1 : lstStandB) {
			if (standB1.getTicket().getIdTicket() == idTicketBefor) {
				return idTicketBefor;
			}
		}
		return -1;
	}

	public int getIdTicketAfter(List<StandB> lstStandB) {
		int idTicketAfter;
		int check = 0;
		idTicketAfter = input.enterInteger("Enter new id Ticket: ");
		for (StandB standB1 : lstStandB) {
			if (standB1.getTicket().getIdTicket() != idTicketAfter) {
				check = 1;
			}
		}
		if (check == 1) {
			return idTicketAfter;
		} else {
			System.out.println("Id Ticket already exist");
		}

		return -1;
	}

	public int payTicketA(List<StandA> lstStandA, StandA standA) {
		int idTicket;
		int check = 0;
		idTicket = input.enterInteger("Enter ID want pay");
		for (StandA standA1 : lstStandA) {
			if (standA1.getTicket().getIdTicket() == idTicket) {
				SimpleDateFormat format = new SimpleDateFormat(
						"HH:mm:ss dd/MM/yyyy");
				Date date = new Date();
				String dateOut = format.format(date.getTime());
				standA1.setTimeOut(dateOut);
				check = 1;
			}
		}
		if (check == 1) {
			return idTicket;
		}

		return 0;

	}

	public int payTicketB(List<StandB> lstStandB, StandB standB) {
		int idTicket;
		int check = 0;
		idTicket = input.enterInteger("Enter ID want pay");
		for (StandB standB1 : lstStandB) {
			if (standB1.getTicket().getIdTicket() == idTicket) {
				SimpleDateFormat format = new SimpleDateFormat(
						"HH:mm:ss dd/MM/yyyy");
				Date date = new Date();
				String dateOut = format.format(date.getTime());
				standB1.setTimeOut(dateOut);
				check = 1;
			}
		}
		if (check == 1) {
			return idTicket;
		}

		return 0;

	}

	public void showStandA(List<StandA> lstStandA) {
		for (StandA standA : lstStandA) {
			System.out.println(standA.getAmountTicketVip());
			System.out.println("\t=====Ticket=====");
			System.out.println("\tID ticket: "
					+ standA.getTicket().getIdTicket());
			System.out.println("\tName of Match: "
					+ standA.getTicket().getNameMatch());
			System.out.println("\tNumber of chair: "
					+ standA.getTicket().getNumberOfChair());
			System.out.println("\tType ticket: "
					+ standA.getTicket().getTypeTicket());
			System.out.println("\tPrice: " + standA.getTicket().getPrice());
			System.out.println("\tTime match: "
					+ standA.getTicket().getTimeStart());
			System.out.println("\t=====customer=====");
			System.out.println("\tID customer: "
					+ standA.getCustomer().getIdCustomer());
			System.out.println("\tName: "
					+ standA.getCustomer().getNameCustomer());
			System.out.println("\tAddress: "
					+ standA.getCustomer().getAddress());
		}

	}

	public void showStandB(List<StandB> lstStandB) {
		for (StandB standB1 : lstStandB) {
			System.out.println("\t=====Ticket=====");
			System.out.println("\tID ticket: "
					+ standB1.getTicket().getIdTicket());
			System.out.println("\tName of Match: "
					+ standB1.getTicket().getNameMatch());
			System.out.println("\tNumber of chair: "
					+ standB1.getTicket().getNumberOfChair());
			System.out.println("\tType ticket: "
					+ standB1.getTicket().getTypeTicket());
			System.out.println("\tPrice: " + standB1.getTicket().getPrice());
			System.out.println("\tTime match: "
					+ standB1.getTicket().getTimeStart());
			System.out.println("\t=====customer=====");
			System.out.println("\tID customer: "
					+ standB1.getCustomer().getIdCustomer());
			System.out.println("\tName: "
					+ standB1.getCustomer().getNameCustomer());
			System.out.println("\tAddress: "
					+ standB1.getCustomer().getAddress());
		}

	}

	public void showChairBoughtA(List<StandA> lstStandA) {
		System.out.println("List chair was hired");
		if (lstStandA.size() == 0) {
			System.out.println("All chair empty");
		}
		for (StandA standA : lstStandA) {
			System.out.println(standA.getTicket().getNumberOfChair() + " - ");
		}

	}

	public void showChairBoughtB(List<StandB> lstStandB) {
		System.out.println("List chair was hired");
		if (lstStandB.size() == 0) {
			System.out.println("All chair empty");
		}
		for (StandB standB1 : lstStandB) {
			System.out.println(standB1.getTicket().getNumberOfChair() + " - ");
		}

	}

}
