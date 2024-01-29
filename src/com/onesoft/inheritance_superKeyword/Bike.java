package com.onesoft.inheritance_superKeyword;

public class Bike {
	String brand;
	int price;
	int model;
	
	public Bike(String brand, int price, int model) {
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	
	public String toString() {
		return brand+" "+price+" "+ model ;
	}
	

}
