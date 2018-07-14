package com.nvt.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.nvt.common.Iconfig;
import com.nvt.entity.Customer;
import com.nvt.entity.StandA;
import com.nvt.entity.StandB;
import com.nvt.entity.Ticket;
import com.nvt.imodel.IStadium;

public class StadiumDAO implements IStadium {
	public boolean buyTicketStandA(List<StandA> lstStandA, StandA standA) {
		boolean flag = false;
		int length = 0;

		length = lstStandA.size();
		if (standA != null) {
			lstStandA.add(standA);
		}
		if (lstStandA != null && lstStandA.size() == (length + 1)
				&& lstStandA.size() < 2500) {
			flag = true;
		}

		return flag;
	}

	public boolean buyTicketStandB(List<StandB> lstStandB, StandB standB) {
		boolean flag = false;
		int length = 0;
		length = lstStandB.size();
		if (standB != null) {
			lstStandB.add(standB);
		}
		if (lstStandB != null && lstStandB.size() == (length + 1)
				&& lstStandB.size() < 2500) {
			flag = true;
		}

		return flag;
	}

	public boolean swapStandA(List<StandA> lstStandA, StandA standA,
			Ticket ticket) {
		boolean flag = false;
		for (StandA standA1 : lstStandA) {
			if (standA1.getTicket().getIdTicket() == standA.getTicket()
					.getIdTicket()) {
				ticket.setIdTicket(standA.getTicket().getIdTicket());
				ticket.setNameMatch(standA.getTicket().getNameMatch());
				standA1.setTicket(ticket);
				flag = true;
			}

		}

		return flag;
	}

	public boolean swapStandB(List<StandB> lstStandB, Ticket ticket,
			int idTicketBefor, int idTicketAfter) {
		boolean flag = false;
		for (StandB standB1 : lstStandB) {
			if (standB1.getTicket().getIdTicket() == idTicketBefor) {
				ticket.setIdTicket(idTicketAfter);
				ticket.setNumberOfChair(Iconfig.STAND_B + idTicketAfter);
				standB1.setTicket(ticket);
				flag = true;
			}
		}
		return flag;
	}

	public boolean payStandA(List<StandA> lstStandA, StandA standA, int idTicket) {
		boolean flag = false;
		if (idTicket != 0) {
			SimpleDateFormat format = new SimpleDateFormat(
					"HH:mm:ss dd/MM/yyyy");
			Date date = new Date();
			Date d1 = null;
			Date d2 = null;
			try {
				d1 = format.parse(standA.getTimeIn());
				d2 = format.parse(standA.getTimeOut());

				long timee = d2.getTime() - d1.getTime();
				long second = timee / 1000 % 60;
				long minute = timee / (60 * 1000) % 60;
				long hour = timee / (60 * 60 * 1000) % 24;
				long day = timee / (24 * 60 * 60 * 1000);
				System.out.println("=====Time ticketing: ====");
				System.out.print(day + " day, ");
				System.out.print(hour + " hour, ");
				System.out.print(minute + " minute, ");
				System.out.print(second + " second.");
				if (hour < 48) {
					System.out
							.println("Your can't pay ticket because time < 48Hour");
				} else {
					System.out.println("Okee");
					for (StandA standA1 : lstStandA) {
						if (standA1.getTicket().getIdTicket() == idTicket) {
							lstStandA.remove(standA1);
						}
					}
					flag = true;
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

		return flag;

	}

	public boolean payStandB(List<StandB> lstStandB, StandB standB, int idTicket) {
		boolean flag = false;
		if (idTicket != 0) {
			SimpleDateFormat format = new SimpleDateFormat(
					"HH:mm:ss dd/MM/yyyy");
			Date date = new Date();
			Date d1 = null;
			Date d2 = null;
			try {
				d1 = format.parse(standB.getTimeIn());
				d2 = format.parse(standB.getTimeOut());

				long timee = d2.getTime() - d1.getTime();
				long second = timee / 1000 % 60;
				long minute = timee / (60 * 1000) % 60;
				long hour = timee / (60 * 60 * 1000) % 24;
				long day = timee / (24 * 60 * 60 * 1000);
				System.out.println("=====Time ticketing: ====");
				System.out.print(day + " day, ");
				System.out.print(hour + " hour, ");
				System.out.print(minute + " minute, ");
				System.out.print(second + " second.");
				if (hour < 48) {
					System.out
							.println("Your can't pay ticket because time < 48Hour");
				} else {
					for (StandB standB1 : lstStandB) {
						if (standB1.getTicket().getIdTicket() == idTicket) {
							lstStandB.remove(standB1);
						}
					}
					System.out.println("Okee");
					flag = true;
				}
			} catch (Exception e) {
				System.out.println("Eror!!");
			}
		}

		return flag;

	}

	public double revenueA(List<StandA> lstStandA, StandA standA) {
		double revenue = 0.0;
		int lengthVip = 0;
		int lengthNor = 0;
		for (StandA standA1 : lstStandA) {
			if (standA1.getTicket().getTypeTicket() == Iconfig.TYPE_CHAIR_VIP) {
				lengthVip++;
			} else {
				lengthNor++;
			}
		}

		System.out.println("All have " + lengthVip + " ticket vip and "
				+ lengthNor + " Ticket nor");
		revenue = lengthVip * Iconfig.PRICE_VIP + lengthNor
				* Iconfig.PRICE_NORMAL;

		return revenue;
	}

	public double revenueB(List<StandB> lstStandB, StandB standB) {
		double revenue = 0;
		int length = 0;
		length = lstStandB.size();
		if (length == 0) {
			System.out.println("StandB don't have revenue");
		} else {
			System.out.println("All have " + length + "was bought");
			revenue = length * (standB.getTicket().getPrice());

		}
		return revenue;

	}

}
