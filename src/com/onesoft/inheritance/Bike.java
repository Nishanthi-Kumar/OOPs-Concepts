package com.onesoft.inheritance;

public class Bike {
	String brand;
	int price;
	int model;
	public String findNetprice(int tax) {
		return "NetPrice= "+(price+(price*tax/100));
	}

}
                           