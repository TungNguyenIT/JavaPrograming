package cudosoft.demo.model;

import java.util.List;
import cudosoft.demo.entity.Customer;
import cudosoft.demo.imodel.ICustomer;

public class CustomerDAO implements ICustomer {

	@Override
	public boolean addCustomer(List<Customer> listCustomers) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editCustomer(List<Customer> listCustomers, String identifyCard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(
			List<Customer> listCustomers, String identifyCard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> showCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
