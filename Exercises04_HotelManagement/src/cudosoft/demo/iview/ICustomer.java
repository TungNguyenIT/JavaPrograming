package cudosoft.demo.iview;

import java.util.List;

import cudosoft.demo.entity.Customer;

public interface ICustomer {
	public abstract Customer addCustomer();

	public abstract List<Customer> editCustomer(List<Customer> listCustomer, String identifyCard);

	public abstract List<Customer> deleteCustomer(List<Customer> listCustomer, String identifyCard);

	public abstract void showCustomerList(List<Customer> listCustomer);

}
