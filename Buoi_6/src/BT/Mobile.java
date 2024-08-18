package BT;

public class Mobile extends Product{
	private String manufacturer;
	private int ram;
	public Mobile() {
		
	}
	public Mobile(String id,String name, double price, int total, String manufacturer, int ram) {
		super(id, name, price, total);
		this.manufacturer =  manufacturer;
		this.ram = ram;
		
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	 public String toString(){
		return super.toString() + "manufacturee" + manufacturer + "Ram" +  ram;
		}

}
