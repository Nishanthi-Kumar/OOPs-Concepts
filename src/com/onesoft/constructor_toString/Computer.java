package com.onesoft.constructor_toString;

public class Computer {
	private String brand;
	private int price;
	private boolean isWireless;
	//private Cpu cpu;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
//	public void setPrice(int price) {
//		this.price=price;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setIsWireless(boolean isWireless) {
//		this.isWireless=isWireless;
//	}
//	public boolean getIsWireless() {
//		return isWireless;
//	}
//	public void setCpu(Cpu cpu) {
//		this.cpu=cpu;
//	}
//	public Cpu getCpu() {
//		return cpu;
//	}
	
	public Computer(int price,boolean isWireless) {
		//this.brand=brand;
		this.price=price;
		this.isWireless=isWireless;
		//this.cpu=cpu;
		
	}
	
	public String toString() {
		return brand+" "+price+" "+isWireless;
	}

}
