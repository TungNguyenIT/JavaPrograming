package com.nvt.model;

import java.util.List;

import com.nvt.entity.Person;

public class PersonDAO {
	public boolean addPerson(List<Person> lstPerson, Person person){
		int length = 0;
		boolean flag = false;
		length = lstPerson.size();
		lstPerson.add(person);
		if(lstPerson !=null && lstPerson.size() == (length+1)){
			flag = true;
		}
		return flag;
	}
}
