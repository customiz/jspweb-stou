package model;

import java.util.HashMap;

public class ProductService {

	HashMap<String, Product> products;

	public ProductService() {
		this.products = new HashMap<String, Product>();
	}

	public HashMap<String, Product> getProducts() {
		return products;
	}

	public void setProducts(HashMap<String, Product> products) {
		this.products = products;
	}

	private Product searchProductByName(String name) {
		return products.get(name);
	}

	public void removeProduct(Product p) {
		products.remove(p.getName());
	}

	public void listProduct() {
		for (Product p : products.values()) {
			System.out.println(p);
		}
	}

	public void addProduct(Product p) {
		products.put(p.getName(), p);

	}

	public static void main(String[] args) {
		Product p1 = new Product("Xiaomi", "Amazfit GTS Gold", 3900, "p01.jpg");
		Product p2 = new Product("Fitbit", "Versa 2 Petal Copper", 6000, "p02.jpg");
		Product p3 = new Product("Suunto", "White Bergundy", 13000, "p03.jpg");
		Product p4 = new Product("Garmin", "Vivifit 4 Activity Tracker Black L", 3300, "p04.jpg");

		ProductService cs = new ProductService();
		cs.addProduct(p1);
		cs.addProduct(p2);
		cs.addProduct(p3);
		cs.addProduct(p4);
		cs.listProduct();
		p1.setPrice(4200);
		cs.removeProduct(p2);
		cs.listProduct();
		System.out.println(cs.searchProductByName("Garmin"));

	}

}
