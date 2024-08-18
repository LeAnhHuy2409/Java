package BT;

public abstract class Product {
	private String id;
	private String name;
	private double price;
	private int total;
	
	public Product(){
		
	}
	public Product(String id, String name, double price, int total) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.total = total;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public abstract double gettotalprice();
	@Override
	 public String toString(){
		 return "ID:" +id + ",Name" + name + ",Price" + price + ",Total" + total;
	 }
	 

}
