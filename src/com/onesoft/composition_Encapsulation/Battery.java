package com.onesoft.composition_Encapsulation;

public class Battery {
	String brand;
	int price;
	int capacity;
	
	public void setBrand(String brand) {
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
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	public int getCapacity() {
		return this.capacity;
	}

}
