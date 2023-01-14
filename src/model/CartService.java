package model;

import java.time.LocalDate;
import java.util.HashMap;

public class CartService {

	HashMap<String, Cart> cart;

	public CartService() {

	}

	public void addCart(Cart cart) {
		this.cart.put(cart.getCustomer().getFirstname(), cart);
	}

	public static void main(String[] args) {

		Product p1 = new Product("Xiaomi", "Amazfit GTS Gold", 3900, "p01.jpg");
		Product p2 = new Product("Fitbit", "Versa 2 Petal Copper", 6000, "p02.jpg");
		Product p3 = new Product("Suunto", "White Bergundy", 13000, "p03.jpg");
		ProductService ps = new ProductService();
		ps.addProduct(p1);
		ps.addProduct(p2);
		ps.addProduct(p3);
		ps.listProduct();

		Customer c1 = new Customer("Urai", "sudjai", "urai", "urai", LocalDate.now());
		Customer c2 = new Customer("Paitoon", "sukjai", "paitoon", "paitoon", LocalDate.now());
		CustomerService cs = new CustomerService();
		cs.addCustomer(c1);
		cs.addCustomer(c2);
		cs.listCustomer();

		Cart cart1 = new Cart(c1);
		cart1.addItem(p1, 50);
		cart1.addItem(p2, 10);
		cart1.addItem(p3, 30);
		cart1.removeItem(p1);
		System.out.println(cart1.searchItemByProductName("Suunto"));

/*		Cart cart2 = new Cart(c2);
		cart2.addItem(p1, 50);
		cart2.addItem(p2, 10);

		CartService cts = new CartService();
		cts.addCart(cart1);
		cts.addCart(cart2);

		cts.listCart();
		System.out.println(cts.searchCartByCustomer(c2));  */

	}

	public void listCart() {
	    for (Cart c : cart.values()) {
	        System.out.println(c);
	    }
	}

	public Cart searchCartByCustomer(Customer c) {
		return cart.get(c.getFirstname());
	}

}
