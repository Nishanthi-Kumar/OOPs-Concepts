package com.onesoft.constructor_toString;

public class Lense {
	private String brand;
	private int price;
	private String focalLength;
	private boolean isMadeInIndia;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setFocalLength(String focalLength) {
		this.focalLength=focalLength;
	}
	public String getFocalLength() {
		return focalLength;
	}
	public void setIsMadeInIndia(boolean isMadeInIndia) {
		this.isMadeInIndia=isMadeInIndia;
	}
	public void setNetprice(int price,int tax) {
		this.price=price+(price*tax/100);
	}
	public int getNetPrice() {
		return this.price;
	}
	
	public Lense(String brand,int price,String focalLength,boolean isMadeInIndia) {
		this.brand=brand;
		this.price=price;
		this.focalLength=focalLength;
		this.isMadeInIndia=isMadeInIndia;
	}
	public String toString() {
		return brand+" "+price+" "+focalLength+" "+isMadeInIndia;
	}

}
