package com.onesoft.interface_AbstractClass;

public class UseTamilnaduGov {
	public static void main(String[] args) {
		TamilnaduGov tn=new TamilnaduGov();
		System.out.println(tn.fontSize(21));
		System.out.println(tn.fontColor("red"));
		System.out.println(tn.stateCode("TN"));
		tn.numberPlateColor("Public");
	}

}
