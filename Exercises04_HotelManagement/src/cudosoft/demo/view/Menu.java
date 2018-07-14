package cudosoft.demo.view;

import cudosoft.demo.common.IConfiguration;
import cudosoft.demo.common.IMenu;
import cudosoft.demo.common.IMessage;

public class Menu implements IMenu, IMessage{

	@Override
	public void mainMenu() {
		System.out.println("Enter "+ IConfiguration.MENU_ROOM +": To handle Room");
		System.out.println("Enter "+ IConfiguration.MENU_TRANSACTION+": To handle Transaction");
		System.out.println("Enter "+ IConfiguration.MENU_CUSTOMER+": To handle Customer");
		System.out.println("Enter "+ IConfiguration.MENU_EXIT+": To exit");
	}

	@Override
	public void menuRoom() {
		System.out.println("\tEnter "+IConfiguration.MENU_ADD_ROOM+": To add room information");
		System.out.println("\tEnter "+IConfiguration.MENU_EDIT_ROOM+": To edit room information");
		System.out.println("\tEnter "+IConfiguration.MENU_ROOM_IS_EMPTY+": To show room is empty list");
		System.out.println("\tEnter "+IConfiguration.MENU_ROOM_IS_NOT_EMPTY+": To show room is not empty list");
		System.out.println("\tEnter "+IConfiguration.MENU_ROOM_ALL+": To show room list");
		System.out.println("\tEnter "+IConfiguration.MENU_DELETE_ROOM+": To delete room");
	}

	@Override
	public void menuTransaction() {
		System.out.println("\tEnter "+IConfiguration.MENU_CHECKIN+": To checkin");
		System.out.println("\tEnter "+IConfiguration.MENU_CHECKOUT+": To checkout");
		System.out.println("\tEnter "+IConfiguration.MENU_SWITCH_ROOM+": To switch room");
	}

	@Override
	public void menuCustomer() {
		System.out.println("\tEnter "+IConfiguration.MENU_ADD_CUSTOMER+": To add customer information");
		System.out.println("\tEnter "+IConfiguration.MENU_EDIT_CUSTOMER+": To edit customer information");
		System.out.println("\tEnter "+IConfiguration.MENU_DELETE_CUSTOMER+": To delete customer information");
	}

	@Override
	public void showMessage(String message) {
		System.out.println(IConfiguration.ROOM_TYPE_VIP + " " + message + " " + IConfiguration.ROOM_DISCOUNT_VIP);
		System.out.println(IConfiguration.ROOM_TYPE_NORMAL + " " + message + " " + IConfiguration.ROOM_DISCOUNT_NORMAL);
	}

}
