package cudosoft.demo.imodel;

import java.util.List;

import cudosoft.demo.entity.Customer;

public interface ICustomer {
	public abstract boolean addCustomer(List<Customer> listCustomers);

	public abstract boolean editCustomer(List<Customer> listCustomers,
			String identifyCard);

	public abstract boolean deleteCustomer(List<Customer> listCustomers,
			String identifyCard);
	
	public abstract List<Customer> showCustomerList();

}
