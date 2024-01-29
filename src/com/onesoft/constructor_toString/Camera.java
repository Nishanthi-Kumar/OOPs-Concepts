package com.onesoft.constructor_toString;

public class Camera {
	 String brand;
	int price;
	 String color;
 boolean isUsbConnection;
	//private Lense lense;
	public void setBrand(String brand1) {
		brand=brand1;
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
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setIsUseConnection(boolean isUsbConnection) {
		this.isUsbConnection=isUsbConnection;
	}
	public boolean getIsUsbConnection() {
		return isUsbConnection;
	}
//	public void setLense(Lense lense) {
//		this.lense=lense;
//	}
//	public Lense getLense() {
//		return lense;
//	}
	
	public Camera(String brand,int price,String color,boolean isUsbConnection) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isUsbConnection=isUsbConnection;
		//this.lense=lense;
		
	}
//	public String toString() {
//		return brand+" "+price+" "+color+" "+isUsbConnection+" "+lense;
//	}

}
