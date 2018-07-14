package cudosoft.demo.model;

import java.util.Comparator;

import cudosoft.demo.entity.Room;

//Lớp này thực hiện interface Comparator<Room>.
//Nó là một quy tắc để so sánh các đối tượng Room.
public class RoomComparator implements Comparator<Room> {

	// Ghi đè (override) phương thức compare.
	// Nêu rõ quy tắc so sánh 2 đối tượng Room.
	@Override
	public int compare(Room room1, Room room2) {
		// Hai đối tượng null coi như bằng nhau.
		if (room1 == null && room2 == null) {
			return 0;
		}
		// Nếu room1 là null, coi như room2 lớn hơn
		if (room1 == null) {
			return -1;
		}
		// Nếu room2 là null, coi như room1 lớn hơn.
		if (room2 == null) {
			return 1;
		}
		// Nguyên tắc:
		// Sắp xếp tăng dần theo số phòng theo từng loại chẵn lẻ.
		int value = room1.getRoomNumber() - room2.getRoomNumber();
		if (value != 0) {
			return value;
		}
		
		return value;
	}

}
