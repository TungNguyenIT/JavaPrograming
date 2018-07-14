package cudosoft.demo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cudosoft.demo.common.IConfiguration;
import cudosoft.demo.entity.Room;
import cudosoft.demo.imodel.IRoom;

public class RoomDAO implements IRoom {

	@Override
	public boolean addRoom(List<Room> listRoom, Room room) {
		int length = 0;
		boolean flag = false;

		room.setPice(room.getRentCost() * room.getDiscount() / 100);
		length = listRoom.size();
		listRoom.add(room);

		if (listRoom != null && listRoom.size() == (length + 1)) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean editRoom(List<Room> listRoom, Room room) {
		for (Room roomObject : listRoom) {
			if (roomObject.getRoomNumber() == room.getRoomNumber()){
				roomObject.setRoomNumber(room.getRoomNumber());
				roomObject.setRoomType(room.getRoomType());
				roomObject.setNumberOfPeople(room.getNumberOfPeople());
				roomObject.setRentCost(room.getRentCost());
				roomObject.setDiscount(room.getDiscount());
				roomObject.setNumberOfDayRented(room.getNumberOfDayRented());
				roomObject.setPice(room.getRentCost() * (room.getDiscount()/100));
				roomObject.setStatus(room.getStatus());
			}
		}
		return true;
	}

	@Override
	public boolean deleteRoom(List<Room> listRoom, int roomNumber) {
		boolean flag = false;
		int length = 0;
		length = listRoom.size();
		if (listRoom != null) {
			for (Room room : listRoom) {
				if (roomNumber == room.getRoomNumber()) {
					listRoom.remove(room);
				}
			}
			
			if (listRoom.size() == (length - 1)) {
				flag = true;
			}
		}
		
		return flag;
	}

	@Override
	public List<Room> showRoomList(List<Room> listRoom) {
		// Get data from database by query language
		Collections.sort(listRoom, new RoomComparator());
		return listRoom;
	}

	@Override
	public List<Room> showRoomAvailableList(List<Room> listRoom) {
		List<Room> listRoomAvailable =  new ArrayList<Room>();
		// Get data from database by query language
		for (Room room : listRoom) {
			if(room.getStatus().equalsIgnoreCase(IConfiguration.ROOM_STATUS_AVAILABLE)) {
				listRoomAvailable.add(room);
			}
		}
		
		return listRoomAvailable;
	}

	@Override
	public List<Room> showRoomBusyList(List<Room> listRoom) {
		List<Room> listRoomBusy =  new ArrayList<Room>();
		// Get data from database by query language
		for (Room room : listRoom) {
			if(room.getStatus().equalsIgnoreCase(IConfiguration.ROOM_STATUS_BUSY)) {
				listRoomBusy.add(room);
			}
		}
		
		return listRoomBusy;
	}

}
