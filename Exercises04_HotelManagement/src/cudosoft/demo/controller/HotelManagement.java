package cudosoft.demo.controller;

import java.util.ArrayList;
import java.util.List;

import cudosoft.demo.common.IConfiguration;
import cudosoft.demo.entity.Room;
import cudosoft.demo.iview.IEnterData;
import cudosoft.demo.model.RoomDAO;
import cudosoft.demo.view.EnterData;
import cudosoft.demo.view.Menu;
import cudosoft.demo.view.RoomImp;

public class HotelManagement {
	public static void main(String[] args) {
		int option = 0;
		boolean flag = false;
		String confirmValue;
		Menu menu = new Menu();
		IEnterData data = new EnterData();
		RoomImp roomImp = new RoomImp();
		RoomDAO roomDAO = new RoomDAO();
		Room room = null;
		List<Room> listRoom = null;
		List<Room> listRoomAvailable = null;
		List<Room> listRoomBusy = null;

		do {
			menu.showMessage("discount");
			menu.mainMenu();
			option = data.intValue("You can choose a function above:");
			switch (option) {
			case IConfiguration.MENU_ROOM: {
				do {
					do {
						menu.menuRoom();
						flag = false;
						option = data.intValue("\tYou can choose a sub function above:");
						if (option != IConfiguration.MENU_ADD_ROOM
								&& option != IConfiguration.MENU_EDIT_ROOM
								&& option != IConfiguration.MENU_ROOM_IS_EMPTY
								&& option != IConfiguration.MENU_ROOM_IS_NOT_EMPTY
								&& option != IConfiguration.MENU_ROOM_ALL
								&& option != IConfiguration.MENU_DELETE_ROOM) {
							flag = true;
							roomImp.showMessage("The value " + option + " has not sub function valid! Please try other sub function!");
						}
					} while (flag);

					switch (option) {
					case IConfiguration.MENU_ADD_ROOM: {
						listRoom = new ArrayList<Room>();
						do {
							flag = false;
							room = new Room();
							roomImp.addRoom(room);

							flag = roomDAO.addRoom(listRoom, room);
							if (flag) {
								roomImp.showMessage("Added successfully!");
							} else {
								roomImp.showMessage("Added failure!");
							}
							confirmValue = data.stringValue("Do you want to add other room? Enter Y or N: ");
						} while (!confirmValue.equalsIgnoreCase(IConfiguration.CONFIRM_VALUE));
						
						break;
					}
					case IConfiguration.MENU_EDIT_ROOM: {
						do {
							flag = false;
							room = roomImp.editRoom(listRoom);
							flag = roomDAO.editRoom(listRoom, room);
							if (flag) {
								roomImp.showMessage("Edited successfully!");
							} else {
								roomImp.showMessage("Edited failure!");
							}
							
							confirmValue = data.stringValue("Do you want to edit other room? Enter Y or N: ");
						} while (!confirmValue.equalsIgnoreCase(IConfiguration.CONFIRM_VALUE));
						
						break;
					}
					case IConfiguration.MENU_ROOM_IS_EMPTY: {
						listRoomAvailable = roomDAO.showRoomAvailableList(listRoom);
						roomImp.showRoomList(listRoomAvailable);

						break;
					}
					case IConfiguration.MENU_ROOM_IS_NOT_EMPTY: {
						listRoomBusy = roomDAO.showRoomBusyList(listRoom);
						roomImp.showRoomList(listRoomBusy);

						break;
					}
					case IConfiguration.MENU_ROOM_ALL: {
						listRoom = roomDAO.showRoomList(listRoom);
						roomImp.showRoomList(listRoom);

						break;
					}
					case IConfiguration.MENU_DELETE_ROOM: {
						do {
							flag = false;
							int roomNumber = 0;
							roomNumber = roomImp.deleteRoom();
							if (roomNumber != -1) {
								flag = roomDAO.deleteRoom(listRoom, roomNumber);
							}
							if (flag = true) {
								roomImp.showMessage("Room is deleted successfully!");
							} else {
								roomImp.showMessage("Room is not deleted!");
							}

							confirmValue = data.stringValue("Do you want to delete other room? Enter Y or N: ");
						} while (!confirmValue.equalsIgnoreCase(IConfiguration.CONFIRM_VALUE));
						
						break;
					}
					}

					confirmValue = data.stringValue("Do you want execute other sub function of Room? Enter Y or N: ");
				} while (!confirmValue.equalsIgnoreCase(IConfiguration.CONFIRM_VALUE));

				break;
			}
			case IConfiguration.MENU_TRANSACTION: {

				break;
			}
			case IConfiguration.MENU_CUSTOMER: {

				break;
			}
			case IConfiguration.MENU_EXIT: {

				break;
			}
			default:
				break;
			}

		} while (option != IConfiguration.MENU_EXIT);
	}
}
