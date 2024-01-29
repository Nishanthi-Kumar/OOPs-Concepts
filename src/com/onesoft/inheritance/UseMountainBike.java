package com.onesoft.inheritance;

public class UseMountainBike {
	public static void main(String[] args) {
		MountainBike mb=new MountainBike();
		mb.brand="Yamaha";
		mb.price=175000;
		mb.model=2021;
		mb.climbingSpeed=95;
		mb.weight=250.5f;
        System.out.println("Brand:"+mb.brand+"Netprice:"+mb.findNetprice(5));	
	}

}
