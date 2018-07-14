package com.nvt.model;

import java.util.Comparator;

import com.nvt.entity.StandA;

public class NumberChairComparatorA {
	//Lớp này thực hiện interface Comparator<Room>.
	//Nó là một quy tắc để so sánh các đối tượng Room.
	public class RoomComparator implements Comparator<StandA> {

		// Ghi đè (override) phương thức compare.
		// Nêu rõ quy tắc so sánh 2 đối tượng Room.
		@Override
		public int compare(StandA standA1, StandA standA2) {
			// Hai đối tượng null coi như bằng nhau.
			if (standA1 == null && standA2 == null) {
				return 0;
			}
			// Nếu room1 là null, coi như room2 lớn hơn
			if (standA1 == null) {
				return -1;
			}
			// Nếu room2 là null, coi như room1 lớn hơn.
			if (standA2 == null) {
				return 1;
			}
			// Nguyên tắc:
			// Sắp xếp tăng dần theo số phòng theo từng loại chẵn lẻ.
			int value = standA1.getTicket().getIdTicket() - standA2.getTicket().getIdTicket();
			if (value != 0) {
				return value;
			}
			
			return value;
		}

	}

}
