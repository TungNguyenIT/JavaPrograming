package cudosoft.demo.entity;

public class Room {
	private int roomNumber;
	private String roomType;
	private int numberOfPeople;
	private int rentCost;
	private int discount;
	private double pice;
	private int numberOfDayRented;
	private String status;

	public Room() {
		super();
	}

	public Room(int roomNumber, String roomType, int numberOfPeople,
			int rentCost, int discount, double pice, int numberOfDayRented,
			String status) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.numberOfPeople = numberOfPeople;
		this.rentCost = rentCost;
		this.discount = discount;
		this.pice = pice;
		this.numberOfDayRented = numberOfDayRented;
		this.status = status;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public int getRentCost() {
		return rentCost;
	}

	public void setRentCost(int rentCost) {
		this.rentCost = rentCost;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int sale) {
		this.discount = sale;
	}

	public double getPice() {
		return pice;
	}

	public void setPice(double pice) {
		this.pice = pice;
	}

	public int getNumberOfDayRented() {
		return numberOfDayRented;
	}

	public void setNumberOfDayRented(int numberOfDayRented) {
		this.numberOfDayRented = numberOfDayRented;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
