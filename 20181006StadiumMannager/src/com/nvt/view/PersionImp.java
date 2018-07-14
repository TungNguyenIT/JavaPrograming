package com.nvt.view;

import com.nvt.entity.Person;
import com.nvt.entity.Transaction;

public class PersionImp {
	InputData input = new InputData();
	public Person addPerson(Transaction transaction,Person person){
		int id;
		id = input.enterInteger("Enter id: ");
		person.setId(id);
		
		person.setAge(input.enterInteger("Enter age: "));
		person.setName(input.enterString("Enter name: "));
		person.setAddress(input.enterString("Enter address: "));
		
		return person;
	}
}
