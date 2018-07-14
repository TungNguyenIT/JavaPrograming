package com.nvt.model;

import java.util.List;

import com.nvt.entity.Transaction;

public class TransactionDAO {
	
	public boolean Ticketing(List<Transaction> lstTransaction, Transaction transaction){
		boolean flag = false;
		int length = 0;
		length = lstTransaction.size();
		lstTransaction.add(transaction);
		if(lstTransaction!= null && lstTransaction.size() == (length+1)){
			flag = true;
		}
		
		return flag;
	}
}
