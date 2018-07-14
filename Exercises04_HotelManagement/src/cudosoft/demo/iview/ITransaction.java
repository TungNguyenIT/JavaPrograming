package cudosoft.demo.iview;

import java.util.List;

import cudosoft.demo.entity.Transaction;

public interface ITransaction {
	public abstract Transaction checkIn();

	public abstract Transaction switchRoom(List<Transaction> listTransaction, int transactionID);

	public abstract Transaction checkOut(List<Transaction> listTransaction, int transactionID);

}
