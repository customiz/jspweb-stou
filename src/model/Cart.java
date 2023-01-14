package model;

import java.util.HashMap;

public class Cart {

	HashMap<String, Cart> cart;
	private HashMap<Product, Integer> items;
	private Customer customer;

	public Cart(Customer c) {
		this.customer = c;
		this.items = new HashMap<Product, Integer>();
	}

	public HashMap<Product, Integer> getItems() {
		return items;
	}

	public void setItems(HashMap<Product, Integer> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void addItem(Product p, int quantity) {
		if (items.containsKey(p)) {
			int currentQuantity = items.get(p);
			items.put(p, currentQuantity + quantity);
		} else {
			items.put(p, quantity);
		}
	}

	public HashMap<String, Cart> getCart() {
		return cart;
	}

	public void setCart(HashMap<String, Cart> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Cart [cart=" + cart + "]";
	}

	public void removeItem(Product p) {
		items.remove(p);

	}

	public HashMap<Product, Integer> searchItemByProductName(String name) {
	    HashMap<Product, Integer> result = new HashMap<Product, Integer>();
	    for (Product p : items.keySet()) {
	        if (p.getName().equals(name)) {
	            result.put(p, items.get(p));
	        }
	    }
	    return result;
	}


}
