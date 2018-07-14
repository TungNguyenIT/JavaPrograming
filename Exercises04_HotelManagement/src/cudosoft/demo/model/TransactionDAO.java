package cudosoft.demo.model;

import java.util.List;
import cudosoft.demo.entity.Transaction;
import cudosoft.demo.imodel.ITransaction;

public class TransactionDAO implements ITransaction{

	@Override
	public boolean checkIn(
			List<Transaction> listTransaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchRoom(
			List<Transaction> listTransaction, int transactionID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkOut(
			List<Transaction> listTransaction, int transactionID) {
		// TODO Auto-generated method stub
		return false;
	}

}
