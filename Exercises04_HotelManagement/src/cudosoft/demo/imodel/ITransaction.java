package cudosoft.demo.imodel;

import java.util.List;

import cudosoft.demo.entity.Transaction;

public interface ITransaction {
	public abstract boolean checkIn(List<Transaction> listTransaction);

	public abstract boolean switchRoom(List<Transaction> listTransaction, int transactionID);

	public abstract boolean checkOut(List<Transaction> listTransaction, int transactionID);
}
