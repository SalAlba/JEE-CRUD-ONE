package web;

import java.util.List;

import entities.Customer;

public interface Bean {

	List<Customer> getCustomerList();

	void setCustomerList(List<Customer> customerList);

	Customer getCustomer();

	void setCustomer(Customer customer);

	/**
	 * This function loads the customers.
	 */
	void loadCustomers();

	/**
	 * Finds the customer by id.
	 */
	void findCustomer();

	/**
	 * Clears the current customer bean
	 */
	void clearCustomer();

	/**
	 * This method calls deleteCustomer method of CustomerEjb
	 * to delete the Customer Entity
	 * @param customer
	 * @return index to navigate to index.xhtml
	 */
	String deleteCustomer(Customer customer);

	/**
	 * 
	 * @return index to navigate to index.xhtml page
	 */
	String createCustomer();

	/**
	 * 
	 * @return view to navigate to view.xhtml page
	 */
	String updateCustomer();

}