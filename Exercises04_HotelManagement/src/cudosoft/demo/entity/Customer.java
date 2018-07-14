package cudosoft.demo.entity;

public class Customer extends Person {
	private String identifyCard;
	private int roomNumber;
	private String phone;

	public Customer() {
		super();
	}

	public Customer(String identifyCard, int roomNumber, String phone) {
		super();
		this.identifyCard = identifyCard;
		this.roomNumber = roomNumber;
		this.phone = phone;
	}

	public String getIdentifyCard() {
		return identifyCard;
	}

	public void setIdentifyCard(String identifyCard) {
		this.identifyCard = identifyCard;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
