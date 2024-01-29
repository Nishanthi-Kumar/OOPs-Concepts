package com.onesoft.composition_Encapsulation;

public class AirConditioner {
	private String brand;
	private int price;
	private String type;
	private Compressor compressor;
	
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
		/*if(price>50000) {
			return price+price*5/100;
		}
		else {
			return price-price*8/100;
		}*/
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return this.type;
	}
	public void setCompressor(Compressor compressor) {
		this.compressor=compressor;
	}
	public Compressor getCompressor() {
		return this.compressor;
	}
	
	public void findMax() {
		if(getPrice()>50000) {
			System.out.println(getPrice()-(getPrice()*10/100));
		}else {
			System.out.println(getPrice()+(getPrice()*5/100));
		}
	}
	
	

}
