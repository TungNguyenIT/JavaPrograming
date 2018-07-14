package com.nvt.view;

import com.nvt.common.Iconfig;

public class ShowImp {
	InputData input = new InputData();
	public void showMenu() {
		System.out.println(Iconfig.MENU_TICKETING + " Buy Ticket");
		System.out.println(Iconfig.MENU_SHOW_INFO_STAND+" Show info stand");
		System.out.println(Iconfig.MENU_SWAP_TICKET + " Swap ticket ");
		System.out.println(Iconfig.MENU_PAY_TICKET + " Pay ticket");
		System.out.println(Iconfig.MENU_REVENUE+" Revenue");
		System.out.println(Iconfig.MENU_EXIT + " Exit");
	}

	public void showStand() {
		System.out.print("Stand " + Iconfig.STAND_A +  " | ");
		System.out.print("\tStand " + Iconfig.STAND_B +  " | " );
		System.out.print("\tStand " + Iconfig.STAND_C +  " | ");
		System.out.print("\tStand " + Iconfig.STAND_D+"\n");
	}

	public void showMEssage(String message) {
		System.out.println(message);
	}

	public String enterStand() {
		String option;
		option = input.enterString("Enter option: ");
		return option;
	}

	public int enterOption() {
		int option;
		option = input.enterInteger("Enter option: ");
		return option;
	}
}
