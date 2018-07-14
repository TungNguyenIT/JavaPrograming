package cudosoft.demo.entity;

public class Transaction {
	private int transactionID;
	private Room room;
	private Customer customer;

	public Transaction() {
		super();
	}

	public Transaction(int transactionID, Room room, Customer customer) {
		super();
		this.transactionID = transactionID;
		this.room = room;
		this.customer = customer;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
