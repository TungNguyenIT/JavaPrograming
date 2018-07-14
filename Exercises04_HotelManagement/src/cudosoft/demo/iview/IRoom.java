package cudosoft.demo.iview;

import java.util.List;

import cudosoft.demo.common.IMessage;
import cudosoft.demo.entity.Room;

public interface IRoom extends IMessage {
	public abstract Room addRoom(Room room);

	public abstract Room editRoom(List<Room> listRoom);

	public abstract int deleteRoom();

	public abstract void showRoom(Room room);

	public abstract void showRoomList(List<Room> listRoom);
}
