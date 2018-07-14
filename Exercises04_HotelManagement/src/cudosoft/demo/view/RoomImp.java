package cudosoft.demo.view;

import java.util.List;

import cudosoft.demo.common.IConfiguration;
import cudosoft.demo.common.IMessage;
import cudosoft.demo.entity.Room;
import cudosoft.demo.iview.IRoom;

public class RoomImp implements IRoom, IMessage {

	@Override
	public Room addRoom(Room room) {
		int roomTypeTemp;
		int roomNumber;
		int numberOfPeople;
		int rentCost;
		
		EnterData data = new EnterData();
		roomTypeTemp = data.intValue("Room type => 0: "+IConfiguration.ROOM_TYPE_NORMAL+" - 1: "+ IConfiguration.ROOM_TYPE_VIP);
		roomNumber = data.intValue("Room number: ");
		numberOfPeople = data.intValue("Number of people: ");
		rentCost = data.intValue("Rent cost: ");

		// Set data into object
		switch (roomTypeTemp) {
		case 0: {
			room.setRoomType(IConfiguration.ROOM_TYPE_NORMAL);
			room.setDiscount(IConfiguration.ROOM_DISCOUNT_NORMAL);
			break;
		}
		case 1: {
			room.setRoomType(IConfiguration.ROOM_TYPE_VIP);
			room.setDiscount(IConfiguration.ROOM_DISCOUNT_VIP);
			break;
		}
		default: {
			this.showMessage("This type is undefined!");
			break;
		}
		}
		room.setRoomNumber(roomNumber);
		room.setNumberOfPeople(numberOfPeople);
		room.setRentCost(rentCost);
		room.setStatus(IConfiguration.ROOM_STATUS_AVAILABLE);

		return room;
	}

	@Override
	public Room editRoom(List<Room> listRoom) {
		int roomTypeTemp;
		int roomNumber;
		int numberOfPeople;
		int rentCost;
		int numberOfDayRented = 0;
		int statusTemp = -1;
		boolean check = false;
		Room room = null;
		EnterData data = new EnterData();
		
		roomNumber = data.intValue("Room number: ");
		for (Room roomObject : listRoom) {
			if(roomObject.getRoomNumber() == roomNumber){
				check = true;
			}
		}
		if (check) {
			room = new Room();
			roomTypeTemp = data.intValue("Room type => 0: " + IConfiguration.ROOM_TYPE_NORMAL+" - 1: " + IConfiguration.ROOM_TYPE_VIP + " :");
			numberOfPeople = data.intValue("Number of people: ");
			rentCost = data.intValue("Rent cost: ");
			numberOfDayRented = data.intValue("Number of day rented: ");
			statusTemp = data.intValue("Status => 0: "+ IConfiguration.ROOM_STATUS_BUSY + " - 1: "+ IConfiguration.ROOM_STATUS_AVAILABLE + " :");
			
			// Set data into object
			switch (roomTypeTemp) {
			case 0: {
				room.setRoomType(IConfiguration.ROOM_TYPE_NORMAL);
				room.setDiscount(IConfiguration.ROOM_DISCOUNT_NORMAL);
				break;
			}
			case 1: {
				room.setRoomType(IConfiguration.ROOM_TYPE_VIP);
				room.setDiscount(IConfiguration.ROOM_DISCOUNT_VIP);
				break;
			}
			default: {
				this.showMessage("This type is undefined!");
				break;
			}
			}
			
			switch (statusTemp) {
			case 0: {
				room.setStatus(IConfiguration.ROOM_STATUS_BUSY);
				break;
			}
			case 1: {
				room.setStatus(IConfiguration.ROOM_STATUS_AVAILABLE);
				break;
			}
			default: {
				this.showMessage("Your value is undefined!");
				break;
			}
			}
			room.setRoomNumber(roomNumber);
			room.setNumberOfPeople(numberOfPeople);
			room.setRentCost(rentCost);
			room.setNumberOfDayRented(numberOfDayRented);
			
		}else {
			this.showMessage("Room "+roomNumber+" is not existing in the system!");
		}
		
		return room;
	}

	@Override
	public int deleteRoom() {
		int roomNumber = 0;
		String confirmValue;
		EnterData data = new EnterData();
		roomNumber = data.intValue("Enter room number: ");
		confirmValue = data.stringValue("Did you like remove " + roomNumber	+ "? Are you sure? Y or N");
		if (!confirmValue.equalsIgnoreCase(IConfiguration.CONFIRM_VALUE)) {
			return roomNumber;
		}
		
		return -1;
	}

	@Override
	public void showRoom(Room room) {
		System.out.println("Room number: " + room.getRoomNumber());
		System.out.println("Room type: " + room.getRoomType());
		System.out.println("Room number of people: " + room.getNumberOfPeople());
		System.out.println("Room rent cost: " + room.getRentCost());
		System.out.println("Room discount: " + room.getDiscount());
		System.out.println("Room price: " + room.getPice());
		System.out.println("Room number of day rented: " + room.getNumberOfDayRented());
		System.out.println("Room status: "+ room.getStatus());
		System.out.println("-------------------------------------");
	}
	
	@Override
	public void showRoomList(List<Room> listRoom) {
		for (Room room : listRoom) {
			this.showRoom(room);
		}
	}

	@Override
	public void showMessage(String message) {
		System.out.println(message);

	}

}
