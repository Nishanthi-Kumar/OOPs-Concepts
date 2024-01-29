package com.onesoft.constructor_toString;

public class CamB extends Camera {
	int sam;
	public CamB(String brand,int price,String color,boolean isUsbConnection,int sam) {
		super(brand,price,color,isUsbConnection);
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isUsbConnection=isUsbConnection;
		this.sam=sam;
	}

}
