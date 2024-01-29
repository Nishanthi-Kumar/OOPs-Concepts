package com.onesoft.constructor_toString;

public class Coil {
	private String brand;
	private int price;
	private String type;
	
	/*public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return this.type;
	}*/

	
	public Coil(String brand,int price,String type) {
		this.brand=brand;
		this.price=price;
		this.type=type;
	}
	
	public String toString() {
		return ""+price;
		
	}
	

}
