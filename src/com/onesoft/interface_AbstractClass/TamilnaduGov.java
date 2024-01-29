package com.onesoft.interface_AbstractClass;

public class TamilnaduGov extends CentralGoverment {
	public String stateCode(String code) {
		return code;
	}
	
	public void numberPlateColor(String type) {
		if(type.equalsIgnoreCase("Public")) {
			System.out.println("White or Black");
		}
		else if(type.equalsIgnoreCase("Private")) {
			System.out.println("Yellow or Black");
		}
		else {
			System.out.println("Green or Black");
		}
	}
	
	public int fontSize(int size) {
		return size;
	}
	public String fontColor(String color) {
		return color;
	}

}
