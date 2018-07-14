package cudosoft.demo.imodel;

import java.util.List;

import cudosoft.demo.entity.Room;

public interface IRoom {
	public abstract boolean addRoom(List<Room> listRoom, Room room);

	public abstract boolean editRoom(List<Room> listRoom, Room room);

	public abstract boolean deleteRoom(List<Room> listRoom, int roomNumber);

	public abstract List<Room> showRoomList(List<Room> listRoom);

	public abstract List<Room> showRoomAvailableList(List<Room> listRoom);

	public abstract List<Room> showRoomBusyList(List<Room> listRoom);

}
