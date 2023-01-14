package model;

public class Product {
	private static int nextId = 1;
	private int id, price;
	private String name, desc, img;

	public Product(String name, String desc, int price, String img) {
		this.id = nextId++;
		this.price = price;
		this.name = name;
		this.desc = desc;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", desc=" + desc + ", img=" + img + "]";
	}

}
