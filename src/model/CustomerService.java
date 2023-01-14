package model;

import java.time.LocalDate;
import java.util.HashMap;

public class CustomerService {

	HashMap<String, Customer> customer;

	public CustomerService() {
		this.customer = new HashMap<String, Customer>();
	}

	public void addCustomer(Customer c) {
		customer.put(c.getFirstname(), c);
	}

	public void listCustomer() {
		for (Customer c : customer.values()) {
			System.out.println(c);
		}
	}

	public Customer searchCustomerByName(String name) {
		return customer.get(name);
	}

	public void removeCustomer(String name) {
		customer.remove(name);
	}

	public static void main(String[] args) {
		Customer c1 = new Customer("Urai", "sudjai", "urai", "urai", LocalDate.now());
		Customer c2 = new Customer("Paitoon", "sukjai", "paitoon", "paitoon", LocalDate.now());

		CustomerService cs = new CustomerService();
		cs.addCustomer(c1);
		cs.addCustomer(c2);
		cs.listCustomer();
		System.out.println(cs.searchCustomerByName("Urai"));
		c1.setPassword("uraisudjai");
		cs.removeCustomer("Urai");
		cs.listCustomer();
	}

}
